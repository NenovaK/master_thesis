package edu.kit.exp.impl.WebApiExperiment.server;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import edu.kit.exp.client.gui.screens.Screen;
import edu.kit.exp.common.IScreenParamObject;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaBlueprintScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaRamlUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaRamlUiScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaRamlYamlFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaRamlYamlScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaSwaggerJsonScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaSwaggerUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaSwaggerUiScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaSwaggerYamlFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaSwaggerYamlScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiAmfFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiAmfScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiBlueprintFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiBlueprintScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiRamlUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiRamlUiScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiRamlYamlFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiRamlYamlScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiSwaggerJsonBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiSwaggerJsonFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiSwaggerUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.MobileOrderApiSwaggerUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsAmfScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsBlueprintFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.ExperimentConfiguration;
import edu.kit.exp.impl.WebApiExperiment.client.AifbAmfBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbAmfFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbBlueprintBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbBlueprintFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbRamlUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbRamlUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbRamlYamlBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbRamlYamlFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbSwaggerJsonBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbSwaggerJsonFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbSwaggerUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.AifbSwaggerUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.InitialScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaAmfFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaAmfScreen;
import edu.kit.exp.impl.WebApiExperiment.client.LufthansaBlueprintFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.TroubleScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsAmfFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsBlueprintScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsRamlUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsRamlUiScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsRamlYamlFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsRamlYamlScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsSwaggerJsonScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsSwaggerUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsSwaggerUiScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsSwaggerYamlFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.UeberMapsSwaggerYamlScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkAmfBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkAmfFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkBlueprintBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkBlueprintFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkRamlUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkRamlUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkRamlYamlBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkRamlYamlFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkSwaggerJsonBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkSwaggerJsonFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkSwaggerUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WordAssocNetworkSwaggerUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiAmfBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiAmfFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiBlueprintBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiBlueprintFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiRamlUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiRamlUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiRamlYamlBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiRamlYamlFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiSwaggerUiBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiSwaggerUiFeelScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiSwaggerYamlBrowserScreen;
import edu.kit.exp.impl.WebApiExperiment.client.WorldMusicApiSwaggerYamlFeelScreen;
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
		case 5:
			showAlternative6(msg, parameter);
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
			// first is always SwaggerUI
			showScreen(msg.getClientId(), LufthansaSwaggerUiScreen.class, parameter);
			break;
		case 2:
			// second is always SwaggerUI Feel
			showScreen(msg.getClientId(), LufthansaSwaggerUiFeelScreen.class, parameter);
			break;
		case 3:
			// third is always RAML UI
			showScreen(msg.getClientId(), WordAssocNetworkRamlUiBrowserScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML UI Feel
			showScreen(msg.getClientId(), WordAssocNetworkRamlUiFeelScreen.class, parameter);
			break;
		case 5:
			// fourth is always API Blueprint
			showScreen(msg.getClientId(), UeberMapsBlueprintScreen.class, parameter);
			break;
		case 6:
			// fourth is always API Blueprint Feel
			showScreen(msg.getClientId(), UeberMapsBlueprintFeelScreen.class, parameter);
			break;
		case 7:
			// fourth is always Swagger Text
			showScreen(msg.getClientId(), MobileOrderApiSwaggerJsonBrowserScreen.class, parameter);
			break;
		case 8:
			// fourth is always Swagger Text Feel
			showScreen(msg.getClientId(), MobileOrderApiSwaggerJsonFeelScreen.class, parameter);
			break;
		case 9:
			// fourth is always RAML YAML
			showScreen(msg.getClientId(), WorldMusicApiRamlYamlBrowserScreen.class, parameter);
			break;
		case 10:
			// fourth is always RAML YAML Feel
			showScreen(msg.getClientId(), WorldMusicApiRamlYamlFeelScreen.class, parameter);
			break;
		case 11:
			// fourth is always AMF
			showScreen(msg.getClientId(), AifbAmfBrowserScreen.class, parameter);
			break;
		case 12:
			// fourth is always AMF Feel
			showScreen(msg.getClientId(), AifbAmfFeelScreen.class, parameter);

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
			// first is always SwaggerUI
			showScreen(msg.getClientId(), WordAssocNetworkSwaggerUiBrowserScreen.class, parameter);
			break;
		case 2:
			// second is always SwaggerUI Feel
			showScreen(msg.getClientId(), WordAssocNetworkSwaggerUiFeelScreen.class, parameter);
			break;
		case 3:
			// third is always RAML UI
			showScreen(msg.getClientId(), UeberMapsRamlUiScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML UI Feel
			showScreen(msg.getClientId(), UeberMapsRamlUiFeelScreen.class, parameter);
			break;
		case 5:
			// fourth is always API Blueprint
			showScreen(msg.getClientId(), MobileOrderApiBlueprintScreen.class, parameter);
			break;
		case 6:
			// fourth is always API Blueprint Feel
			showScreen(msg.getClientId(), MobileOrderApiBlueprintFeelScreen.class, parameter);
			break;
		case 7:
			// fourth is always Swagger Text
			showScreen(msg.getClientId(), WorldMusicApiSwaggerYamlBrowserScreen.class, parameter);
			break;
		case 8:
			// fourth is always Swagger Text Feel
			showScreen(msg.getClientId(), WorldMusicApiSwaggerYamlFeelScreen.class, parameter);
			break;
		case 9:
			// fourth is always RAML YAML
			showScreen(msg.getClientId(), AifbRamlYamlBrowserScreen.class, parameter);
			break;
		case 10:
			// fourth is always RAML YAML Feel
			showScreen(msg.getClientId(), AifbRamlYamlFeelScreen.class, parameter);
			break;
		case 11:
			// fourth is always AMF
			showScreen(msg.getClientId(), LufthansaAmfScreen.class, parameter);
			break;
		case 12:
			// fourth is always AMF Feel
			showScreen(msg.getClientId(), LufthansaAmfFeelScreen.class, parameter);
			
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
			// first is always SwaggerUI
			showScreen(msg.getClientId(), UeberMapsSwaggerUiScreen.class, parameter);
			break;
		case 2:
			// second is always SwaggerUI Feel
			showScreen(msg.getClientId(), UeberMapsSwaggerUiFeelScreen.class, parameter);
			break;
		case 3:
			// third is always RAML UI
			showScreen(msg.getClientId(), MobileOrderApiRamlUiScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML UI Feel
			showScreen(msg.getClientId(), MobileOrderApiRamlUiFeelScreen.class, parameter);
			break;
		case 5:
			// fourth is always API Blueprint
			showScreen(msg.getClientId(), WorldMusicApiBlueprintBrowserScreen.class, parameter);
			break;
		case 6:
			// fourth is always API Blueprint Feel
			showScreen(msg.getClientId(), WorldMusicApiBlueprintFeelScreen.class, parameter);
			break;
		case 7:
			// fourth is always Swagger Text
			showScreen(msg.getClientId(), AifbSwaggerJsonBrowserScreen.class, parameter);
			break;
		case 8:
			// fourth is always Swagger Text Feel
			showScreen(msg.getClientId(), AifbSwaggerJsonFeelScreen.class, parameter);
			break;
		case 9:
			// fourth is always RAML YAML
			showScreen(msg.getClientId(), LufthansaRamlYamlScreen.class, parameter);
			break;
		case 10:
			// fourth is always RAML YAML Feel
			showScreen(msg.getClientId(), LufthansaRamlYamlFeelScreen.class, parameter);
			break;
		case 11:
			// fourth is always AMF
			showScreen(msg.getClientId(), WordAssocNetworkAmfBrowserScreen.class, parameter);
			break;
		case 12:
			// fourth is always AMF Feel
			showScreen(msg.getClientId(), WordAssocNetworkAmfFeelScreen.class, parameter);
			
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
			// first is always SwaggerUI
			showScreen(msg.getClientId(), MobileOrderApiSwaggerUiBrowserScreen.class, parameter);
			break;
		case 2:
			// second is always SwaggerUI Feel
			showScreen(msg.getClientId(), MobileOrderApiSwaggerUiFeelScreen.class, parameter);
			break;
		case 3:
			// third is always RAML UI
			showScreen(msg.getClientId(), WorldMusicApiRamlUiBrowserScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML UI Feel
			showScreen(msg.getClientId(), WorldMusicApiRamlUiFeelScreen.class, parameter);
			break;
		case 5:
			// fourth is always API Blueprint
			showScreen(msg.getClientId(), AifbBlueprintBrowserScreen.class, parameter);
			break;
		case 6:
			// fourth is always API Blueprint Feel
			showScreen(msg.getClientId(), AifbBlueprintFeelScreen.class, parameter);
			break;
		case 7:
			// fourth is always Swagger Text
			showScreen(msg.getClientId(), LufthansaSwaggerYamlScreen.class, parameter);
			break;
		case 8:
			// fourth is always Swagger Text Feel
			showScreen(msg.getClientId(), LufthansaSwaggerYamlFeelScreen.class, parameter);
			break;
		case 9:
			// fourth is always RAML YAML
			showScreen(msg.getClientId(), WordAssocNetworkRamlYamlBrowserScreen.class, parameter);
			break;
		case 10:
			// fourth is always RAML YAML Feel
			showScreen(msg.getClientId(), WordAssocNetworkRamlYamlFeelScreen.class, parameter);
			break;
		case 11:
			// fourth is always AMF
			showScreen(msg.getClientId(), UeberMapsAmfScreen.class, parameter);
			break;
		case 12:
			// fourth is always AMF Feel
			showScreen(msg.getClientId(), UeberMapsAmfFeelScreen.class, parameter);
			
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
			// first is always SwaggerUI
			showScreen(msg.getClientId(), WorldMusicApiSwaggerUiBrowserScreen.class, parameter);
			break;
		case 2:
			// second is always SwaggerUI Feel
			showScreen(msg.getClientId(), WorldMusicApiSwaggerUiFeelScreen.class, parameter);
			break;
		case 3:
			// third is always RAML UI
			showScreen(msg.getClientId(), AifbRamlUiBrowserScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML UI Feel
			showScreen(msg.getClientId(), AifbRamlUiFeelScreen.class, parameter);
			break;
		case 5:
			// fourth is always API Blueprint
			showScreen(msg.getClientId(), LufthansaBlueprintScreen.class, parameter);
			break;
		case 6:
			// fourth is always API Blueprint Feel
			showScreen(msg.getClientId(), LufthansaBlueprintFeelScreen.class, parameter);
			break;
		case 7:
			// fourth is always Swagger Text
			showScreen(msg.getClientId(), WordAssocNetworkSwaggerJsonBrowserScreen.class, parameter);
			break;
		case 8:
			// fourth is always Swagger Text Feel
			showScreen(msg.getClientId(), WordAssocNetworkSwaggerJsonFeelScreen.class, parameter);
			break;
		case 9:
			// fourth is always RAML YAML
			showScreen(msg.getClientId(), UeberMapsRamlYamlScreen.class, parameter);
			break;
		case 10:
			// fourth is always RAML YAML Feel
			showScreen(msg.getClientId(), UeberMapsRamlYamlFeelScreen.class, parameter);
			break;
		case 11:
			// fourth is always AMF
			showScreen(msg.getClientId(), MobileOrderApiAmfScreen.class, parameter);
			break;
		case 12:
			// fourth is always AMF Feel
			showScreen(msg.getClientId(), MobileOrderApiAmfFeelScreen.class, parameter);
			
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
	
	
	private void showAlternative6(ClientResponseMessage msg, IScreenParamObject parameter) throws Exception {

		switch (screenNumber) {
		case 0:
			showScreen(msg.getClientId(), InitialScreen.class, parameter);
			break;
		case 1:
			// first is always SwaggerUI
			showScreen(msg.getClientId(), AifbSwaggerUiBrowserScreen.class, parameter);
			break;
		case 2:
			// second is always SwaggerUI Feel
			showScreen(msg.getClientId(), AifbSwaggerUiFeelScreen.class, parameter);
			break;
		case 3:
			// third is always RAML UI
			showScreen(msg.getClientId(), LufthansaRamlUiScreen.class, parameter);
			break;
		case 4:
			// fourth is always RAML UI Feel
			showScreen(msg.getClientId(), LufthansaRamlUiFeelScreen.class, parameter);
			break;
		case 5:
			// fourth is always API Blueprint
			showScreen(msg.getClientId(), WordAssocNetworkBlueprintBrowserScreen.class, parameter);
			break;
		case 6:
			// fourth is always API Blueprint Feel
			showScreen(msg.getClientId(), WordAssocNetworkBlueprintFeelScreen.class, parameter);
			break;
		case 7:
			// fourth is always Swagger Text
			showScreen(msg.getClientId(), UeberMapsSwaggerYamlScreen.class, parameter);
			break;
		case 8:
			// fourth is always Swagger Text Feel
			showScreen(msg.getClientId(), UeberMapsSwaggerYamlFeelScreen.class, parameter);
			break;
		case 9:
			// fourth is always RAML YAML
			showScreen(msg.getClientId(), MobileOrderApiRamlYamlScreen.class, parameter);
			break;
		case 10:
			// fourth is always RAML YAML Feel
			showScreen(msg.getClientId(), MobileOrderApiRamlYamlFeelScreen.class, parameter);
			break;
		case 11:
			// fourth is always AMF
			showScreen(msg.getClientId(), WorldMusicApiAmfBrowserScreen.class, parameter);
			break;
		case 12:
			// fourth is always AMF Feel
			showScreen(msg.getClientId(), WorldMusicApiAmfFeelScreen.class, parameter);
			
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
