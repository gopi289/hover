package project2;

import org.openqa.selenium.By;

public class POMSpice {
	
	public By from= By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']");
	public By Fchoose= By.xpath("//*[@class=\"livecl city_selected\"]//*[@value='CJB']");
	public By To= By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT\"]");
	public By Tchoose= By.xpath("(//*[@class='livecl']//*[@value='BOM'])[2]");
	//public By radio=By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]");
	//public By dates=By.xpath("(//*[@id=\"custom_date_picker_id_1\"])[1]");
	//public By date=By.cssSelector(".'ui-state-default ui-state-highlight ui-state-active'");
	public By mutipleradio=By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_TripPlanner\"]");
	public By pop=By.xpath("//*[@class=\"ok-btn float-right\"]");
	public By passenger=By.xpath("//*[@id=\"divpaxinfo\"]");
	public By infant= By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT\"]");
	public By currency=By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']");
	public By cbox=By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends']");
	//public By adult= By.xpath("id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT\"");
}
