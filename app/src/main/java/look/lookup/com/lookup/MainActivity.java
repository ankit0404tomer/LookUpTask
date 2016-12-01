package look.lookup.com.lookup;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.google.gson.Gson;

import java.util.List;

import look.lookup.com.lookup.Adapter.CategoryAdapter;
import look.lookup.com.lookup.Adapter.RecyclerViewAdapter;
import look.lookup.com.lookup.Model.Model;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter mAdapter;
    CategoryAdapter mCategoryAdapter;
    private String result;
    private RecyclerView mRecyclerViewNearby, mRecyclerViewCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        initilisation();
        List<Model.DataEntity.BusinessesEntity> businessesEntities = parsingData(result);
        settingDataAdapterCategory(businessesEntities);
        settingDataNearby(businessesEntities);
    }

    private void settingDataNearby(List<Model.DataEntity.BusinessesEntity> businessesEntities) {
        mRecyclerViewNearby.setNestedScrollingEnabled(false);
        mAdapter = new RecyclerViewAdapter(businessesEntities, MainActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerViewNearby.setLayoutManager(mLayoutManager);
        mRecyclerViewNearby.setItemAnimator(new DefaultItemAnimator());
        mRecyclerViewNearby.setAdapter(mAdapter);
    }

    private void initilisation() {
        result = "{\"data\": {\"businesses\": [{\"employeeCount\": null, \"updatedAt\": 1475508155061," +
                " \"address\": {\"state\": null, \"pin\": \"110075\", \"city\": \"Delhi\", \"locality\": " +
                "\"Delhi\", \"landmark\": null, \"country\": \"India\", \"street\": null, \"addressLine\": " +
                "\"Mumbai\"}, \"features\": null, \"generalInfo\": null, \"placeId\": null, \"timings\":" +
                " {\"tuesday\": [{\"close\": \"00:00\", \"open\": \"00:00\"}], \"thursday\": [], \"friday\": [], " +
                "\"saturday\": [], \"sunday\": [{\"close\": \"00:00\", \"open\": \"00:00\"}], \"wednesday\": []," +
                " \"monday\": [{\"close\": \"00:00\", \"open\": \"00:00\"}]}, \"onlinePayment\": false," +
                " \"businessTypes\": null, \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": " +
                "\"918470007678\"}], \"premiumSellerInfo\": null, \"knownFor\": null, \"nowfloats\": " +
                "{\"parentId\": null, \"id\": \"CANROHIT\"}, \"id\": \"04a4b7e8-6b16-468b-9ef9-41c6ba4ca9ce\"," +
                " \"paymentMethods\": null, \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", " +
                "\"id\": \"rohit@canbrand.in\"}], \"businessImages\": null, \"status\": \"VERIFIED\"," +
                " \"timestamp\": 1475508155061, \"description\": \"An elegant room featuring a king size bed or" +
                " twin beds offers individually controlled air-conditioning, bathroom with shower, hairdryer, cable " +
                "TV, direct dial telephone, mini-bar and free WiFi Internet access. Double rooms feature modern amenities" +
                " and a comfortable environment.\", \"website\": \"http://CANROHIT.nowfloats.com\", \"bookingStatus\":" +
                " \"INACTIVE\", \"name\": \"Crown Hotel\", \"category\": null, \"premiumSeller\": false, \"registeredName\":" +
                " null, \"profileImage\": \"https://floatingpointimages.s3.amazonaws.com/actual/574572f49ec6680e08a9009c.jpg\"," +
                " \"location\": \"28.599353,77.036034\", \"coverImage\": null, \"socialNetworks\": null, \"poc\": null, " +
                "\"subcategories\": null, \"parentId\": null, \"source\": \"NOWFLOATS\", \"claimedUser\": {\"phoneNumbers\": " +
                "[{\"type\": \"PRIMARY\", \"number\": \"918470007678\"}], \"email\": null, \"role\": {\"description\": " +
                "\"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"406b5a87-45e8-4173-a607-eb4a72158af3\"" +
                ", \"name\": \"Rohit\"}}, {\"employeeCount\": null, \"updatedAt\": 1475495856965, \"address\": {\"state\": null," +
                " \"pin\": \"500045\", \"city\": \"Hyderabad\", \"locality\": \"Hyderabad\", \"landmark\": null, \"country\":" +
                " \"India\", \"street\": null, \"addressLine\": \"#1, FF, Rukmini Apartment, Yousufguda check post, , 500045\"}," +
                " \"features\": null, \"generalInfo\": null, \"placeId\": null, \"timings\": {\"tuesday\": [{\"close\": " +
                "\"19:30\", \"open\": \"09:00\"}], \"thursday\": [], \"friday\": [{\"close\": \"19:30\", \"open\": \"09:00\"}]," +
                " \"saturday\": [{\"close\": \"19:30\", \"open\": \"09:00\"}], \"sunday\": [{\"close\": \"19:30\", \"open\": " +
                "\"09:00\"}], \"wednesday\": [{\"close\": \"19:30\", \"open\": \"09:00\"}], \"monday\": [{\"close\": \"19:30\"," +
                " \"open\": \"09:00\"}]}, \"onlinePayment\": false, \"businessTypes\": null, \"phoneNumbers\": [{\"type\": " +
                "\"PRIMARY\", \"number\": \"918527414402\"}], \"premiumSellerInfo\": null, \"knownFor\": null, \"nowfloats\": " +
                "{\"parentId\": null, \"id\": \"BRAJ\"}, \"id\": \"a567be93-b006-464c-86e1-0545f93c5d0a\", \"paymentMethods\": " +
                "null, \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", \"id\": \"brajmadhav@gmail.com\"}]," +
                " \"businessImages\": null, \"status\": \"VERIFIED\", \"timestamp\": 1475495856965, \"description\": \"I help" +
                " brands stay creatively relevant through t-shirt design. Whether it\\u2019s a company looking to build culture" +
                " or a band growing their loyal fan base through merch. I also do logos from time to time. Creating minimal " +
                "graphics with purpose and making letters look good is what I love to do most.\", \"website\": \"http://BRAJ.nowfloats.com\", " +
                "\"bookingStatus\": \"INACTIVE\", \"name\": \"Hangman's Design Studio\", \"category\": null, \"premiumSeller\":" +
                " false, \"registeredName\": null, \"profileImage\": \"https://floatingpointimages.s3.amazonaws.com/actual/574f10459ec67110a40871c9.jpg\", \"location\": \"17.436689,78.428123\", \"coverImage\": null, \"socialNetworks\": [{\"url\": \"Ink.That.Thinks\"," +
                " \"tag\": \"FACEBOOK\"}], \"poc\": null, \"subcategories\": null, \"parentId\": null, \"source\": \"NOWFLOATS\", \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"918527414402\"}], \"email\": null, \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"eba6194f-7bed-4276-a734-4de5fd987214\", \"name\": \"Braj Madhav\"}}, {\"employeeCount\": null, \"updatedAt\": 1475494785015, \"address\": {\"state\": null, \"pin\": \"390007\", \"city\": \"Vadodara\"," +
                " \"locality\": \"Vadodara\", \"landmark\": null, \"country\": \"India\", \"street\": null, \"addressLine\": \"Nadiad\"}, \"features\": null, \"generalInfo\": null, \"placeId\": null, \"timings\": {\"tuesday\": [{\"close\": \"20:30\", \"open\": \"11:00\"}], \"thursday\": [{\"close\": \"20:30\", \"open\": \"11:00\"}], \"friday\": [{\"close\": \"20:30\", \"open\": \"11:00\"}], \"saturday\": [{\"close\": \"20:30\", \"open\": \"11:00\"}], \"sunday\": [{\"close\": \"20:30\", \"open\": \"11:00\"}], \"wednesday\": [{\"close\": \"20:30\", \"open\": \"11:00\"}], \"monday\": [{\"close\": \"20:30\", \"open\": \"11:00\"}]}, \"onlinePayment\": false, \"businessTypes\": null, \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"919099932030\"}], \"premiumSellerInfo\": null, \"knownFor\": null, \"nowfloats\": {\"parentId\": null, \"id\": \"AUTOMOTIVE\"}, \"id\": \"7f9910e1-489f-436e-8fa7-c9042a057ad9\", \"paymentMethods\": null, \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", \"id\": \"chiragmakvana@live.com\"}], \"businessImages\": null, \"status\": \"VERIFIED\", \"timestamp\": 1475494785015, \"description\": \"Be updated with all automotive launches in no time.\", \"website\": \"http://AUTOMOTIVE.nowfloats.com\", \"bookingStatus\": \"INACTIVE\", \"name\": \"Automotive - Be updated with all automotive launches in no time - By One and only Chirag Makwana\", \"category\": null, \"premiumSeller\": false, \"registeredName\": null, \"profileImage\": \"https://floatingpointimages.s3.amazonaws.com/actual/57dbc5b09ec668162835d1e7.jpg\", \"location\": \"22.307159,73.181219\", \"coverImage\": null, \"socialNetworks\": [{\"url\": \"chiragmakvana\", \"tag\": \"FACEBOOK\"}], \"poc\": null, \"subcategories\": null, \"parentId\": null, \"source\": \"NOWFLOATS\", \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"919099932030\"}], \"email\": null, \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"4a340d77-870e-4f95-81e1-0c439753abbb\", \"name\": \"Automotive - Be updated with all automotive launches in no time - By One and only Chirag Makwana\"}}, {\"employeeCount\": null, \"updatedAt\": 1475494103448, \"address\": {\"state\": null, \"pin\": null, \"city\": \"Pondicherry\", \"locality\": \"Pondicherry\", \"landmark\": null, \"country\": \"India\", \"street\": null, \"addressLine\": \"7007, B4 Avenue, WJ Street, Wonderland Enclave\"}, \"features\": null, \"generalInfo\": null, \"placeId\": null, \"timings\": {\"tuesday\": [{\"close\": \"19:30\", \"open\": \"13:30\"}], \"thursday\": [], \"friday\": [{\"close\": \"19:30\", \"open\": \"13:30\"}], \"saturday\": [{\"close\": \"19:30\", \"open\": \"13:30\"}], \"sunday\": [{\"close\": \"19:30\", \"open\": \"13:30\"}], \"wednesday\": [], \"monday\": [{\"close\": \"19:30\", \"open\": \"13:30\"}]}, \"onlinePayment\": false, \"businessTypes\": null, \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"918121312033\"}], \"premiumSellerInfo\": null, \"knownFor\": null, \"nowfloats\": {\"parentId\": null, \"id\": \"SAIFWILLANAM\"}, \"id\": \"a7e39ef9-d35c-47b3-a414-7c3f69c61e2c\", \"paymentMethods\": null, \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", \"id\": \"saif.anam@nowfloats.com\"}], \"businessImages\": null, \"status\": \"VERIFIED\", \"timestamp\": 1475494103448, \"description\": \"The Zone is the right choice for visitors who are searching for a combination of charm, peace and quiet, and a convenient position from which to explore Pondicherry. It is a small, comfortable hotel. The Derai family and their staff offer an attentive, personalized service and are always available to offer any help to guests. The hotel is arranged on three floors, without a lift. On the ground floor, apart from the reception, there is a comfortable lounge where you can sit and drink tea, or just read. There is also a splendid terrace, where, you can relax and immerge yourself from morning onwards in the atmosphere of Pondicherry daily life, watching the city travelling about by water and people gathering together and filling the alleyways and little squares with their chatter.The rooms are arranged on the first, second and third floors.\", \"website\": \"http://SAIFWILLANAM.nowfloats.com\", \"bookingStatus\": \"INACTIVE\", \"name\": \"The Zone\", \"category\": null, \"premiumSeller\": false, \"registeredName\": null, \"profileImage\": \"https://floatingpointimages.s3.amazonaws.com/actual/578159189ec66c213c932a1a.jpg\", \"location\": \"12.9715987,77.5945627\", \"coverImage\": null, \"socialNetworks\": [{\"url\": \"michaeljackson\", \"tag\": \"FACEBOOK\"}], \"poc\": null, \"subcategories\": null, \"parentId\": null, \"source\": \"NOWFLOATS\", \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"918121312033\"}], \"email\": null, \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"7bbdb40c-eab3-46e9-8c2e-8cb9222d7968\", \"name\": \"The Zone\"}}, {\"employeeCount\": null, \"updatedAt\": 1475237900681, \"address\": {\"state\": null, \"pin\": \"\", \"city\": \"Hyderabad\", \"locality\": \"Hyderabad\", \"landmark\": null, \"country\": \"India\", \"street\": null, \"addressLine\": \"Jubilee Hills\"}, \"features\": null, \"generalInfo\": null, \"placeId\": null, \"timings\": {\"tuesday\": [{\"close\": null, \"open\": null}], \"thursday\": [{\"close\": null, \"open\": null}], \"friday\": [{\"close\": null, \"open\": null}], \"saturday\": [{\"close\": null, \"open\": null}], \"sunday\": [{\"close\": null, \"open\": null}], \"wednesday\": [{\"close\": null, \"open\": null}], \"monday\": [{\"close\": null, \"open\": null}]}, \"onlinePayment\": false, \"businessTypes\": null, \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"919336108208\"}], \"premiumSellerInfo\": null, \"knownFor\": null, \"nowfloats\": {\"parentId\": null, \"id\": \"TESTMANAGE\"}, \"id\": \"cfb0efd4-06b0-490e-a588-c88f2001c813\", \"paymentMethods\": null, \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", \"id\": \"rachitkasera@hotmail.com\"}], \"businessImages\": null, \"status\": \"VERIFIED\", \"timestamp\": 1475237900681, \"description\": \"Demo account to test manage portal test\", \"website\": \"http://TESTMANAGE.nowfloats.com\", \"bookingStatus\": \"INACTIVE\", \"name\": \"testmanage\", \"category\": null, \"premiumSeller\": false, \"registeredName\": null, \"profileImage\": \"https://floatingpointimages.s3.amazonaws.com/actual/57d6adc59ec6690b4864f275.jpg\", \"location\": \"17.434436020969645,78.40407248586415\", \"coverImage\": null, \"socialNetworks\": [{\"url\": \"rahul.kedia.71\", \"tag\": \"FACEBOOK\"}], \"poc\": null, \"subcategories\": null, \"parentId\": null, \"source\": \"NOWFLOATS\", \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"919336108208\"}], \"email\": null, \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"5c964fed-388f-42dc-adfd-2519531ecd1b\", \"name\": \"testmanage\"}}, {\"employeeCount\": null, \"updatedAt\": 1474451396602, \"address\": {\"state\": null, \"pin\": \"500033\", \"city\": \"Hyderabad, Telangana\", \"locality\": \"Hyderabad, Telangana\", \"landmark\": null, \"country\": \"India\", \"street\": null, \"addressLine\": \"Hyderabad, , , 500033\"}, \"features\": null, \"generalInfo\": null, \"placeId\": null, \"timings\": {\"tuesday\": [{\"close\": null, \"open\": null}], \"thursday\": [{\"close\": null, \"open\": null}], \"friday\": [{\"close\": null, \"open\": null}], \"saturday\": [{\"close\": null, \"open\": null}], \"sunday\": [{\"close\": null, \"open\": null}], \"wednesday\": [{\"close\": null, \"open\": null}], \"monday\": [{\"close\": null, \"open\": null}]}, \"onlinePayment\": false, \"businessTypes\": null, \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"917504825521\"}], \"premiumSellerInfo\": null, \"knownFor\": null, \"nowfloats\": {\"parentId\": null, \"id\": \"ADVANCEDMATHS\"}, \"id\": \"e95dff68-955d-479f-90fc-c1f41cdabf76\", \"paymentMethods\": null, \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", \"id\": \"romio.ranjan@nowfloats.com\"}], \"businessImages\": null, \"status\": \"VERIFIED\", \"timestamp\": 1474451396602, \"description\": \"Get your favourite maths tricks here\", \"website\": \"http://ADVANCEDMATHS.nowfloats.com\", \"bookingStatus\": \"INACTIVE\", \"name\": \"Play With Numbers\", \"category\": null, \"premiumSeller\": false, \"registeredName\": null, \"profileImage\": \"https://floatingpointimages.s3.amazonaws.com/actual/57913f129ec66833849e52c8.jpg\", \"location\": \"17.432464,78.4071173\", \"coverImage\": null, \"socialNetworks\": null, \"poc\": null, \"subcategories\": null, \"parentId\": null, \"source\": \"NOWFLOATS\", \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"917504825521\"}], \"email\": null, \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"c8b8f768-fdaa-431d-8d86-3b812ec5d6e8\", \"name\": \"Romeo\"}}, {\"employeeCount\": null, \"updatedAt\": 1473231966112, \"address\": {\"state\": null, \"pin\": \"\", \"city\": \"Bengaluru\", \"locality\": \"Bengaluru\", \"landmark\": null, \"country\": \"India\", \"street\": null, \"addressLine\": \"Bengaluru\"}, \"features\": null, \"generalInfo\": null, \"placeId\": null, \"timings\": null, \"onlinePayment\": false, \"businessTypes\": null, \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"919633853665\"}], \"premiumSellerInfo\": null, \"knownFor\": null, \"nowfloats\": {\"parentId\": null, \"id\": \"TESTYGENERALSERVICESBENGALURU\"}, \"id\": \"1756c99e-8f08-4189-bc48-86e1a108c033\", \"paymentMethods\": null, \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", \"id\": \"sishin.santhosh@gmail.com\"}], \"businessImages\": null, \"status\": \"VERIFIED\", \"timestamp\": 1473231966112, \"description\": \"\", \"website\": \"http://TESTYGENERALSERVICESBENGALURU.nowfloats.com\", \"bookingStatus\": \"INACTIVE\", \"name\": \"Testy\", \"category\": null, \"premiumSeller\": false, \"registeredName\": null, \"profileImage\": null, \"location\": \"12.934893255387555,77.61691723018885\", \"coverImage\": null, \"socialNetworks\": null, \"poc\": null, \"subcategories\": null, \"parentId\": null, \"source\": \"NOWFLOATS\", \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"919633853665\"}], \"email\": null, \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"8cbb1999-01dc-4b7e-980d-4dfe6865d525\", \"name\": null}}, {\"employeeCount\": null, \"updatedAt\": 1473159053949, \"address\": {\"state\": null, \"pin\": \"\", \"city\": \"Bangalore Urban\", \"locality\": \"Bangalore Urban\", \"landmark\": null, \"country\": \"India\", \"street\": null, \"addressLine\": \"Bangalore,India\"}, \"features\": null, \"generalInfo\": null, \"placeId\": null, \"timings\": null, \"onlinePayment\": false, \"businessTypes\": null, \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"918147419173\"}], \"premiumSellerInfo\": null, \"knownFor\": null, \"nowfloats\": {\"parentId\": null, \"id\": \"DIBIN\"}, \"id\": \"54dabb4c-8e5d-4f9c-9c55-3d7085f2e01c\", \"paymentMethods\": null, \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", \"id\": \"dibinpv1990@gmail.com\"}], \"businessImages\": null, \"status\": \"VERIFIED\", \"timestamp\": 1473159053949, \"description\": \"\", \"website\": \"http://DIBIN.nowfloats.com\", \"bookingStatus\": \"INACTIVE\", \"name\": \"Dibin\", \"category\": null, \"premiumSeller\": false, \"registeredName\": null, \"profileImage\": \"https://floatingpointimages.s3.amazonaws.com/actual/57874d889ec6690af4643c37.jpg\", \"location\": \"12.971599,77.594563\", \"coverImage\": null, \"socialNetworks\": null, \"poc\": null, \"subcategories\": null, \"parentId\": null, \"source\": \"NOWFLOATS\", \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"918147419173\"}], \"email\": null, \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"1BB0FFD1-504D-441F-96AF-D47443C508E41462971130\", \"name\": null}}, {\"employeeCount\": 0, \"updatedAt\": 1465476229216, \"address\": {\"state\": \"Karnataka\", \"pin\": \"560095\", \"city\": \"Bengaluru South\", \"locality\": \"koramangala\", \"landmark\": null, \"country\": \"india\", \"street\": \"4\", \"addressLine\": \"dhh\"}, \"features\": [], \"generalInfo\": null, \"placeId\": null, \"timings\": {\"tuesday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"thursday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"friday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"saturday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"sunday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"wednesday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"monday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}]}, \"onlinePayment\": false, \"businessTypes\": [{\"id\": 2, \"name\": \"Retail\"}], \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"767867\"}, {\"type\": \"SECONDARY\", \"number\": \"36871687467\"}], \"premiumSellerInfo\": null, \"knownFor\": [\"vnkjnvj\"], \"id\": \"eac6f634-41bc-415b-91c0-4fe175a9aee8\", \"paymentMethods\": [\"CASH\"], \"registrationDetails\": null, \"emails\": null, \"businessImages\": [], \"status\": \"VERIFIED\", \"timestamp\": 1465475650127, \"description\": \"wash\", \"website\": \"ww.jsjj.com\", \"bookingStatus\": \"INACTIVE\", \"name\": \"Jdjs\", \"category\": {\"keywords\": null, \"id\": 4, \"name\": \"Education\"}, \"premiumSeller\": false, \"registeredName\": null, \"profileImage\": null, \"location\": \"12.935329,77.614246\", \"coverImage\": null, \"socialNetworks\": null, \"poc\": null, \"subcategories\": [{\"keywords\": null, \"id\": 22, \"name\": \"Library\"}, {\"keywords\": null, \"id\": 18, \"name\": \"School\"}, {\"keywords\": null, \"id\": 19, \"name\": \"College\"}], \"parentId\": null, \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"57646\"}, {\"type\": \"SECONDARY\", \"number\": \"6866\"}], \"email\": \"hdjfj@gmail.com\", \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"1BB0FFD1-504D-441F-96AF-D47443C508E41462971130\", \"name\": \"Hdjdj\"}}, {\"employeeCount\": null, \"updatedAt\": 1465274868116, \"address\": {\"state\": \"Karnataka\", \"pin\": \"560095\", \"city\": \"Bangalore\", \"locality\": \"Koramangala\", \"landmark\": \"Near ICICI bank\", \"country\": \"India\", \"street\": \"7th Block\", \"addressLine\": \"6, Ganapathi Temple Rd\\n7th Block, Koramangala\\nBengaluru, Karnataka 560030\"}, \"features\": [{\"id\": 11, \"name\": \"Interior Accessories\"}, {\"id\": 10, \"name\": \"Body Cover\"}, {\"id\": 12, \"name\": \"Exterior Accessories\"}], \"generalInfo\": null, \"placeId\": null, \"timings\": {\"tuesday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"thursday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"friday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"saturday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"sunday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"wednesday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}], \"monday\": [{\"close\": \"18:30\", \"open\": \"09:30\"}]}, \"onlinePayment\": false, \"businessTypes\": [{\"id\": 4, \"name\": \"Service\"}], \"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"7259447616\"}], \"premiumSellerInfo\": null, \"knownFor\": [\"Car care\", \" wheel alignment\", \" 3D stickers\"], \"id\": \"eb91e533-88ba-421f-85b8-8f62b90682b5\", \"paymentMethods\": [], \"registrationDetails\": null, \"emails\": [{\"type\": \"PRIMARY\", \"id\": \"akash@lookup.to\"}], \"businessImages\": [], \"status\": \"VERIFIED\", \"timestamp\": 1465274613819, \"description\": \"Deals with car care\", \"website\": \"www.premiercarcare.biz\", \"bookingStatus\": \"INACTIVE\", \"name\": \"Premier car care\", \"category\": {\"keywords\": null, \"id\": 1, \"name\": \"Automobile\"}, \"premiumSeller\": false, \"registeredName\": null, \"profileImage\": \"https://lookup-staging-images.s3.amazonaws.com/API/images/business/eb91e533-88ba-421f-85b8-8f62b90682b5/profile/fa253351-211a-4273-beb1-4d99f46c8e6f.jpg\", \"location\": \"12.93530890459,77.614239044487\", \"coverImage\": null, \"socialNetworks\": null, \"poc\": null, \"subcategories\": [{\"keywords\": null, \"id\": 2, \"name\": \"Three Wheeler\"}, {\"keywords\": null, \"id\": 1, \"name\": \"Two Wheeler\"}, {\"keywords\": null, \"id\": 3, \"name\": \"Four Wheeler\"}], \"parentId\": null, \"claimedUser\": {\"phoneNumbers\": [{\"type\": \"PRIMARY\", \"number\": \"7259447616\"}], \"email\": null, \"role\": {\"description\": \"Business Owner\", \"label\": \"Business Owner\", \"id\": 1}, \"id\": \"bd987ab2-ce76-48f1-b120-c1c5f8a30e98\", \"name\": \"Akash\"}}]}}";

        mRecyclerViewCategories = (RecyclerView) findViewById(R.id.recy_category);
        mRecyclerViewNearby = (RecyclerView) findViewById(R.id.recy_nearby_stores);

    }

    private void settingDataAdapterCategory(List<Model.DataEntity.BusinessesEntity> businessesEntities) {

        mCategoryAdapter = new CategoryAdapter(businessesEntities, MainActivity.this);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerViewCategories.setLayoutManager(mLayoutManager);
        mRecyclerViewCategories.setItemAnimator(new DefaultItemAnimator());
        mRecyclerViewCategories.setAdapter(mCategoryAdapter);

    }

    //parsing APi response using GSON lib
    private List<Model.DataEntity.BusinessesEntity> parsingData(String result) {
        Gson gson = new Gson();
        Model model = gson.fromJson(result, Model.class);
        List<Model.DataEntity.BusinessesEntity> businessesList = model.getData().getBusinesses();
        return businessesList;
    }
}
