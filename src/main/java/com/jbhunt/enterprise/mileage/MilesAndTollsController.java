package com.jbhunt.enterprise.mileage;

import java.util.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

public class MilesAndTollsController {
	//http://localhost:7071/api/miles/citystate/LowellAR/USA/citystate/SpringdaleAR/USA/rand/19/practical?cache=yes
	@FunctionName("getMiles")
	public HttpResponseMessage getMiles(@HttpTrigger(name = "req", methods = {
			HttpMethod.GET }, authLevel = AuthorizationLevel.ANONYMOUS, route = "miles/{originStopType}/{originStop}/{destinationStopType}/{destinationStop}/{country}/{product}/{productVersion}/{routeType}/{restrictions}") HttpRequestMessage<Optional<String>> request,
			@BindingName("originStopType") String originStopType,
			@BindingName("originStop") String originStop,
			@BindingName("destinationStopType") String destinationStopType,
			@BindingName("destinationStop") String destinationStop,
			@BindingName("country") String country,
			@BindingName("product") String product,
			@BindingName("productVersion") String productVersion,
			@BindingName("routeType") String routeType,
			@BindingName("restrictions") String restrictions,
			final ExecutionContext context) {
		context.getLogger().info("Java HTTP trigger processed a request.");
		String cache = request.getQueryParameters().get("cache");
		return request.createResponseBuilder(HttpStatus.OK).body("Hay, The total number of miles is 1000.").build();
	}
	//http://localhost:7071/api/tolls/benar/cityStateCode/lartx/cityStateCode/eagmn/pcmiler/21/SHORTEST/PHYSICALRESTRICTIONS/discount/23/vehicleconfig/120/48/96/80000/4/1?cache=off
	@FunctionName("getTolls")
	public HttpResponseMessage getTolls(@HttpTrigger(name = "req", methods = {
			HttpMethod.GET }, authLevel = AuthorizationLevel.ANONYMOUS, route = "tolls/{originStopType}/{originStop}/{destinationStopType}/{destinationStop}/{country}/{product}/{productVersion}/{routeType}/{restrictions}/{tollType}/{tollVersion}/{vehicleconfig}/{vclHeight}/{vclLength}/{vclWidth}/{vclWeight}/{vclAxleNum}/{vclTrailerNum}") HttpRequestMessage<Optional<String>> request,
			@BindingName("originStopType") String originStopType,
			@BindingName("originStop") String originStop,
			@BindingName("destinationStopType") String destinationStopType,
			@BindingName("destinationStop") String destinationStop,
			@BindingName("country") String country,
			@BindingName("product") String product,
			@BindingName("productVersion") String productVersion,
			@BindingName("routeType") String routeType,
			@BindingName("restrictions") String restrictions,
			@BindingName("tollType") String tollType,
			@BindingName("tollVersion") String tollVersion,
			@BindingName("vehicleconfig") String vehicleconfig,
			@BindingName("vclHeight") String vclHeight,
			@BindingName("vclLength") String vclLength,
			@BindingName("vclWidth") String vclWidth,
			@BindingName("vclWeight") String vclWeight,
			@BindingName("vclAxleNum") String vclAxleNum,
			@BindingName("vclTrailerNum") String vclTrailerNumfinal, ExecutionContext context) {
		context.getLogger().info("Java HTTP trigger processed a request.");
		String cache = request.getQueryParameters().get("cache");
		return request.createResponseBuilder(HttpStatus.OK).body("Hay, The total number of tolls are 10.").build();
	}
}