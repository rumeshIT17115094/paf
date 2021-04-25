package com.rest.delivery;

import models.Delivery;
import controllers.DeliveryController;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("DeliveryResources")
public class DeliveryResource {

	@GET
	@Path("Deliverys")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Delivery> getAllDeliverys() throws Exception {
		return DeliveryController.getInstance().SearchAll();
	}

	@GET
	@Path("Delivery/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Delivery> getDelivery(@PathParam("id") int id) throws Exception {
		Delivery obj = new Delivery();
		obj.setId(id);
		return DeliveryController.getInstance().Search(obj);
	}

	@POST
	@Path("Delivery")
	public String saveDelivery(Delivery obj) throws Exception {
		DeliveryController.getInstance().Save(obj);
		return "Delivery Saved";
	}

	@PUT
	@Path("Delivery")
	public String updateDelivery(Delivery obj) throws Exception {
		DeliveryController.getInstance().Update(obj);
		return "Delivery Updated";
	}

	@DELETE
	@Path("Delivery/{id}")
	public String deleteDelivery(@PathParam("id") int id) throws Exception {
		Delivery obj = new Delivery();
		obj.setId(id);
		DeliveryController.getInstance().Delete(obj);
		return "Delivery Deleted";
	}
}