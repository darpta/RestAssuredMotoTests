package config;

public interface MotoData {

    String SEARCH_ADDRESS_BODY = "{\n" +
            "  \"postal_code\": \"D04X2C2\",\n" +
            "  \"country\": \"IE\"\n" +
            "}";

    String ADD_BIKE_BODY = "{\n" +
            "  \"create_if_not_exists\": false,\n" +
            "  \"key_id\": \"email\",\n" +
            "  \"contacts\": [\n" +
            "    {\n" +
            "      \"activeBike\": \"Fantic 125 XE\",\n" +
            "      \"activeBikeYear\": \"2022\",\n" +
            "      \"activeBikeId\": \"72656\",\n" +
            "      \"activeBikeBrand\": \"Fantic\",\n" +
            "      \"email\": \"jan.kowalski@gmail.com\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    String ADD_ADDRESS_BODY = "{\n" +
            "  \"commonShipToAddress\": {\n" +
            "    \"mainDivision\": \"\",\n" +
            "    \"country\": \"Ireland\",\n" +
            "    \"city\": \"Dublin 4\",\n" +
            "    \"addressLine1\": \"Krzywa 1\",\n" +
            "    \"addressLine2\": \"\",\n" +
            "    \"addressLine3\": \"\",\n" +
            "    \"pickupPointID\": \"\",\n" +
            "    \"companyName1\": \"\",\n" +
            "    \"phoneMobile\": \"6545444654\",\n" +
            "    \"firstName\": \"Jan\",\n" +
            "    \"lastName\": \"Kowalski\",\n" +
            "    \"title\": \"\",\n" +
            "    \"countryCode\": \"IE\",\n" +
            "    \"postalCode\": \"D04X2C2\",\n" +
            "    \"email\": \"jan.kowalski@gmail.com\",\n" +
            "    \"invoiceToAddress\": true,\n" +
            "    \"shipToAddress\": true\n" +
            "  },\n" +
            "  \"invoiceToAddress\": {\n" +
            "    \"mainDivision\": \"\",\n" +
            "    \"country\": \"Ireland\",\n" +
            "    \"city\": \"Dublin 4\",\n" +
            "    \"addressLine1\": \"Krzywa 1\",\n" +
            "    \"addressLine2\": \"\",\n" +
            "    \"addressLine3\": \"\",\n" +
            "    \"pickupPointID\": \"\",\n" +
            "    \"companyName1\": \"\",\n" +
            "    \"phoneMobile\": \"6545444654\",\n" +
            "    \"firstName\": \"Jan\",\n" +
            "    \"lastName\": \"Kowalski\",\n" +
            "    \"title\": \"\",\n" +
            "    \"countryCode\": \"IE\",\n" +
            "    \"postalCode\": \"D04X2C2\",\n" +
            "    \"email\": \"jan.kowalski@gmail.com\",\n" +
            "    \"invoiceToAddress\": true,\n" +
            "    \"shipToAddress\": true\n" +
            "  }\n" +
            "}";

    String PROMOTIONS_TEST_VALUE = "https://pierce-images.imgix.net/images/9/c/9/d/9c9da6262ac017cc6d92310b207bc1f7ffc72c31_3_PIA_150291_0_120.PNG";
}
