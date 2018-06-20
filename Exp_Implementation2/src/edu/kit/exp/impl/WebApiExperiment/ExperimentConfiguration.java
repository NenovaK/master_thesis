package edu.kit.exp.impl.WebApiExperiment;

public class ExperimentConfiguration {

	// 5 minutes plus 2 seconds
	public static final int screenduration = 5*60*1000/30 + 2*1000;

	// 3 minutes plus 2 seconds
	public static final int screenduration_feel = 3*60*100 + 2*1000;
	
	public static final int numberOfPartitions = 6;



	public final static String initial = "www.iism.kit.edu/im";

	public final static String lufthansa_amf = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/Lufthansa/AMF_experiment.html";
	public final static String lufthansa_amf_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=Lufthansa&desc=amf";
	public final static String lufthansa_blueprint = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/Lufthansa/Blueprint.html";
	public final static String lufthansa_blueprint_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=Lufthansa&desc=Blueprint";
	public final static String lufthansa_ramlyaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/Lufthansa/ramlYAML_experiment.html";
	public final static String lufthansa_ramlyaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=Lufthansa&desc=ramlYAML";
	public final static String lufthansa_ramlui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/Lufthansa/ramlUI_experiment.html";
	public final static String lufthansa_ramlui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=Lufthansa&desc=ramlUI";
	public final static String lufthansa_swaggerjson = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/Lufthansa/SwaggerJSON.html";
	public final static String lufthansa_swaggerjson_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=Lufthansa&desc=SwaggerJSON";
	public final static String lufthansa_swaggerui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/Lufthansa/SwaggerUI.html";
	public final static String lufthansa_swaggerui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=Lufthansa&desc=swaggerui";
	public final static String lufthansa_swaggeryaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/Lufthansa/SwaggerYAML.html";
	public final static String lufthansa_swaggeryaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=Lufthansa&desc=SwaggerYAML";

	public final static String mobileorderapi_amf = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/MobileOrderAPI/AMF_experiment.html";
	public final static String mobileorderapi_blueprint = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/MobileOrderAPI/Blueprint.html";
	public final static String mobileorderapi_ramlyaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/MobileOrderAPI/ramlYAML_experiment.html";
	public final static String mobileorderapi_ramlui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/MobileOrderAPI/ramlUI_experiment.html";
	public final static String mobileorderapi_swaggerjson = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/MobileOrderAPI/SwaggerJSON.html";
	public final static String mobileorderapi_swaggerui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/MobileOrderAPI/SwaggerUI.html";
	public final static String mobileorderapi_swaggeryaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/MobileOrderAPI/SwaggerYAML.html";
	public final static String mobileorderapi_amf_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=MobileOrderAPI&desc=amf";
	public final static String mobileorderapi_blueprint_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=MobileOrderAPI&desc=Blueprint";
	public final static String mobileorderapi_ramlyaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=MobileOrderAPI&desc=ramlYAML";
	public final static String mobileorderapi_ramlui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=MobileOrderAPI&desc=ramlUI";
	public final static String mobileorderapi_swaggerjson_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=MobileOrderAPI&desc=SwaggerJSON";
	public final static String mobileorderapi_swaggerui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=MobileOrderAPI&desc=SwaggerUI";
	public final static String mobileorderapi_swaggeryaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=MobileOrderAPI&desc=SwaggerYAML";

	public final static String uebermaps_amf = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/uebermaps/AMF_experiment.html";
	public final static String uebermaps_blueprint = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/uebermaps/Blueprint.html";
	public final static String uebermaps_ramlyaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/uebermaps/ramlYAML_experiment.html";
	public final static String uebermaps_ramlui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/uebermaps/ramlUI_experiment.html";
	public final static String uebermaps_swaggerjson = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/uebermaps/SwaggerJSON.html";
	public final static String uebermaps_swaggerui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/uebermaps/SwaggerUI.html";
	public final static String uebermaps_swaggeryaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/uebermaps/SwaggerYAML.html";
	public final static String uebermaps_amf_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=uebermaps&desc=amf";
	public final static String uebermaps_blueprint_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=uebermaps&desc=Blueprint";
	public final static String uebermaps_ramlyaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=uebermaps&desc=ramlYAML";
	public final static String uebermaps_ramlui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=uebermaps&desc=ramlUI";
	public final static String uebermaps_swaggerjson_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=uebermaps&desc=SwaggerJSON";
	public final static String uebermaps_swaggerui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=uebermaps&desc=SwaggerUI";
	public final static String uebermaps_swaggeryaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=uebermaps&desc=SwaggerYAML";

	public final static String wordassocnetwork_amf = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WordAssocNetwork/AMF_experiment.html";
	public final static String wordassocnetwork_blueprint = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WordAssocNetwork/Blueprint.html";
	public final static String wordassocnetwork_ramlyaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WordAssocNetwork/ramlYAML_experiment.html";
	public final static String wordassocnetwork_ramlui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WordAssocNetwork/ramlUI_experiment.html";
	public final static String wordassocnetwork_swaggerjson = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WordAssocNetwork/SwaggerJSON.html";
	public final static String wordassocnetwork_swaggerui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WordAssocNetwork/SwaggerUI.html";
	public final static String wordassocnetwork_swaggeryaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WordAssocNetwork/SwaggerYAML.html";
	public final static String wordassocnetwork_amf_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WordAssocNetwork&desc=amf";
	public final static String wordassocnetwork_blueprint_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WordAssocNetwork&desc=Blueprint";
	public final static String wordassocnetwork_ramlyaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WordAssocNetwork&desc=ramlYAML";
	public final static String wordassocnetwork_ramlui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WordAssocNetwork&desc=ramlUI";
	public final static String wordassocnetwork_swaggerjson_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WordAssocNetwork&desc=SwaggerJSON";
	public final static String wordassocnetwork_swaggerui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WordAssocNetwork&desc=SwaggerUI";
	public final static String wordassocnetwork_swaggeryaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WordAssocNetwork&desc=SwaggerYAML";

	public final static String worldmusicapi_amf = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WorldMusicAPI/AMF_experiment.html";
	public final static String worldmusicapi_blueprint = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WorldMusicAPI/Blueprint.html";
	public final static String worldmusicapi_ramlyaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WorldMusicAPI/ramlYAML_experiment.html";
	public final static String worldmusicapi_ramlui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WorldMusicAPI/ramlUI_experiment.html";
	public final static String worldmusicapi_swaggerjson = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WorldMusicAPI/SwaggerJSON.html";
	public final static String worldmusicapi_swaggerui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WorldMusicAPI/SwaggerUI.html";
	public final static String worldmusicapi_swaggeryaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/WorldMusicAPI/SwaggerYAML.html";
	public final static String worldmusicapi_amf_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WorldMusicAPI&desc=amf";
	public final static String worldmusicapi_blueprint_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WorldMusicAPI&desc=Blueprint";
	public final static String worldmusicapi_ramlyaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WorldMusicAPI&desc=ramlYAML";
	public final static String worldmusicapi_ramlui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WorldMusicAPI&desc=ramlUI";
	public final static String worldmusicapi_swaggerjson_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WorldMusicAPI&desc=SwaggerJSON";
	public final static String worldmusicapi_swaggerui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WorldMusicAPI&desc=SwaggerUI";
	public final static String worldmusicapi_swaggeryaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=WorldMusicAPI&desc=SwaggerYAML";


	public final static String aifb_amf = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/AIFB/AMF_experiment.html";
	public final static String aifb_blueprint = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/AIFB/Blueprint.html";
	public final static String aifb_ramlyaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/AIFB/ramlYAML_experiment.html";
	public final static String aifb_ramlui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/AIFB/ramlUI_experiment.html";
	public final static String aifb_swaggerjson = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/AIFB/SwaggerJSON.html";
	public final static String aifb_swaggerui = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/AIFB/SwaggerUI.html";
	public final static String aifb_swaggeryaml = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/AIFB/SwaggerYAML.html";
	public final static String aifb_amf_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=AIFB&desc=amf";
	public final static String aifb_blueprint_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=AIFB&desc=Blueprint";
	public final static String aifb_ramlyaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=AIFB&desc=ramlYAML";
	public final static String aifb_ramlui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=AIFB&desc=ramlUI";
	public final static String aifb_swaggerjson_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=AIFB&desc=SwaggerJSON";
	public final static String aifb_swaggerui_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=AIFB&desc=SwaggerUI";
	public final static String aifb_swaggeryaml_feel = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/TAM/Feel.html?api=AIFB&desc=SwaggerYAML";

	public final static String general_information = "http://aifb-ls3-vm1.aifb.kit.edu/Experiment/GenInformation/General_Information.html";

}
