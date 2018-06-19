package edu.kit.exp.impl.WebApiExperiment.server;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import edu.kit.exp.client.gui.screens.Screen;
import edu.kit.exp.common.IScreenParamObject;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaBlueprintScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaRamlUiScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaSwaggerJsonScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaSwaggerYamlScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiAmfScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiBlueprintScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiRamlUiScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiRamlYamlScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiSwaggerUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsAmfScreen;
import edu.kit.exp.impl.WebApiExperiment.ExperimentConfiguration;
import edu.kit.exp.impl.WebApiExperiment.client.InitialScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaAmfScreen;
import edu.kit.exp.impl.WebApiExperiment.client.TroubleScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsBlueprintScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsRamlYamlScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsSwaggerJsonScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkAmfBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkBlueprintBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkRamlYamlBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkSwaggerJsonBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiAmfBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiBlueprintBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiRamlUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiSwaggerUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiSwaggerYamlBrowserScreen;
import edu.kit.exp.server.communication.ClientResponseMessage;
import edu.kit.exp.server.communication.ServerMessageSender;
import edu.kit.exp.server.jpa.entity.Membership;
import edu.kit.exp.server.microeconomicsystem.Institution;

/**
 * The class BrowserExperimentInstitution provides a microeconomic institution
 * for a BrowserExperiment.</br>
 * It is based on an environment which is defined in
 * {@link edu.kit.exp.impl.browserExperiment.server.BrowserExperimentEnvironment
 * BrowserExperimentEnvironment}.
 * 
 * @see Institution
 * @see WebApiExperimentEnvironment
 */
public class WebApiExperimentInstitution extends Institution<WebApiExperimentEnvironment> implements Serializable {

	private int screenNumber;
	private static int overallcounter;
	private static Map<String, Integer> clients;
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 739920533886094574L;

	/**
	 * This constructor instantiates a new BrowserExperimentInstitution.
	 * 
	 * @param environment
	 *            the
	 *            {@link edu.kit.exp.impl.browserExperiment.server.BrowserExperimentEnvironment
	 *            BrowserExperimentEnvironment}
	 * @param memberships
	 *            A Membership list which contains roles for subjects.
	 * @param messageSender
	 *            A ServerMessageSender for sending messages to clients.
	 * @param gameId
	 *            A String variable which contains the ID of the game.
	 */
	public WebApiExperimentInstitution(WebApiExperimentEnvironment environment, List<Membership> memberships,
			ServerMessageSender messageSender, String gameId) {
		super(environment, memberships, messageSender, gameId);
		this.screenNumber = 1;
		if (WebApiExperimentInstitution.clients == null) WebApiExperimentInstitution.clients = new HashMap<String, Integer>();
	}

	/**
	 * This method starts a Period by showing the
	 * <code>BrowserExperimentInitialScreen</code> to the clients.
	 * 
	 * @see edu.kit.exp.impl.browserExperiment.server.BrowserExperimentInstitution
	 *      #startPeriod()
	 */
	@Override
	public void startPeriod() throws Exception {
		for (Membership membership : memberships) {
			showScreen(membership.getSubject(), InitialScreen.class, new Screen.ParamObject());
		}
	}

	/**
	 * This method calls the <code>endPeriod</code> method to end the period.
	 * 
	 * @param msg
	 *            ClientResponseMessage which contains a response from the
	 *            client.
	 */
	@Override
	public void processMessage(ClientResponseMessage msg) throws Exception {
		
		IScreenParamObject parameter = msg.getParameters();
		
		// matches clients to one of the alternative groups using MODULO
		// clients get a according number which is then used to determine 
		// their alternative group at any contact with the server
		if (!clients.containsKey(msg.getClientId())) {
			clients.put(msg.getClientId(), clients.size());
		}
		
		int mod = clients.get(msg.getClientId()) % ExperimentConfiguration.numberOfPartitions;
		switch (mod) {
		case 0:
			showAlternative1(msg, parameter);
			break;
		case 1:
			showAlternative2(msg, parameter);
			break;
		case 2:
			showAlternative3(msg, parameter);
			break;
		case 3:
			showAlternative4(msg, parameter);
			break;
		case 4:
			showAlternative5(msg, parameter);
			break;
		default:
			showScreen(msg.getClientId(), TroubleScreen.class, parameter);
			break;
		}
		
		
	}

	
	
	private void showAlternative1(ClientResponseMessage msg, IScreenParamObject parameter) throws Exception {

		switch (screenNumber) {
		case 0:
			showScreen(msg.getClientId(), InitialScreen.class, parameter);
			break;
		case 1:
			// first is always ApiBlueprint
			showScreen(msg.getClientId(), LufthansaBlueprintScreen.class, parameter);
			break;
		case 2:
			// second is always AMF
			showScreen(msg.getClientId(), MobileOrderApiAmfScreen.class, parameter);
			break;
		case 3:
			// third is always Swagger
			showScreen(msg.getClientId(), UeberMapsSwaggerJsonScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML
			showScreen(msg.getClientId(), WordAssocNetworkRamlYamlBrowserScreen.class, parameter);

			// end
			endPeriod();
			break;

		default:
			endPeriod();
			showScreen(msg.getClientId(), TroubleScreen.class, parameter);
			break;
		} 
		screenNumber++;
	}
	
	
	private void showAlternative2(ClientResponseMessage msg, IScreenParamObject parameter) throws Exception {

		switch (screenNumber) {
		case 0:
			showScreen(msg.getClientId(), InitialScreen.class, parameter);
			break;
		case 1:
			// first is always ApiBlueprint
			showScreen(msg.getClientId(), MobileOrderApiBlueprintScreen.class, parameter);
			break;
		case 2:
			// second is always AMF 
			showScreen(msg.getClientId(), UeberMapsAmfScreen.class, parameter);
			break;
		case 3:
			// third is always Swagger
			showScreen(msg.getClientId(), WordAssocNetworkSwaggerJsonBrowserScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML
			showScreen(msg.getClientId(), WorldMusicApiRamlUiBrowserScreen.class, parameter);
			
			// end
			endPeriod();
			break;
			
		default:
			endPeriod();
			showScreen(msg.getClientId(), TroubleScreen.class, parameter);
			break;
		} 
		screenNumber++;
	}
	
	
	private void showAlternative3(ClientResponseMessage msg, IScreenParamObject parameter) throws Exception {

		switch (screenNumber) {
		case 0:
			showScreen(msg.getClientId(), InitialScreen.class, parameter);
			break;
		case 1:
			// first is always ApiBlueprint
			showScreen(msg.getClientId(), UeberMapsBlueprintScreen.class, parameter);
			break;
		case 2:
			// second is always AMF 
			showScreen(msg.getClientId(), WordAssocNetworkAmfBrowserScreen.class, parameter);
			break;
		case 3:
			// third is always Swagger
			showScreen(msg.getClientId(), WorldMusicApiSwaggerYamlBrowserScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML
			showScreen(msg.getClientId(), LufthansaRamlUiScreen.class, parameter);
			
			// end
			endPeriod();
			break;
			
		} 
		screenNumber++;
	}
	
	private void showAlternative4(ClientResponseMessage msg, IScreenParamObject parameter) throws Exception {

		switch (screenNumber) {
		case 0:
			showScreen(msg.getClientId(), InitialScreen.class, parameter);
			break;
		case 1:
			// first is always ApiBlueprint
			showScreen(msg.getClientId(), WordAssocNetworkBlueprintBrowserScreen.class, parameter);
			break;
		case 2:
			// second is always AMF 
			showScreen(msg.getClientId(), WorldMusicApiAmfBrowserScreen.class, parameter);
			break;
		case 3:
			// third is always Swagger
			showScreen(msg.getClientId(), LufthansaSwaggerJsonScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML
			showScreen(msg.getClientId(), MobileOrderApiRamlUiScreen.class, parameter);
			
			// end
			endPeriod();
			break;

		default:
			endPeriod();
			showScreen(msg.getClientId(), TroubleScreen.class, parameter);
			break;
		} 
		screenNumber++;
	}
	
	private void showAlternative5(ClientResponseMessage msg, IScreenParamObject parameter) throws Exception {

		switch (screenNumber) {
		case 0:
			showScreen(msg.getClientId(), InitialScreen.class, parameter);
			break;
		case 1:
			// first is always ApiBlueprint
			showScreen(msg.getClientId(), WorldMusicApiBlueprintBrowserScreen.class, parameter);
			break;
		case 2:
			// second is always AMF 
			showScreen(msg.getClientId(), LufthansaAmfScreen.class, parameter);
			break;
		case 3:
			// third is always Swagger
			showScreen(msg.getClientId(), MobileOrderApiSwaggerUiBrowserScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML
			showScreen(msg.getClientId(), UeberMapsRamlYamlScreen.class, parameter);
			
			// end
			endPeriod();
			break;

		default:
			endPeriod();
			showScreen(msg.getClientId(), TroubleScreen.class, parameter);
			break;
		} 
		screenNumber++;
	}
	

	@Override
	protected void endPeriod() {
		this.finished = true;
	}
}
