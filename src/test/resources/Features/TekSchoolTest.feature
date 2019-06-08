@TekSchoolTest @alltest 
Feature: Tek School Test 

Background: 
	Given User go to Tek School page 
	And  User click on test environment 
	
@loginTest @smoketest @test
Scenario: Login to test environment 
	When User see test environment page 
	Then User verify test environment title 
	
@loginPage @test
Scenario: Login to My Account 
	When User click on myAccount 
	And User select login from dropdown 
	Then User should see login page 
	
@test001
Scenario Outline: Testing login with different user and pass 
    When User click on myAccount 
	And User select login from dropdown 
	Then User should see login page  
	When User enter username <userName> 
	And  User enter password <password> 
	And  Click continue button 
	Then User should be logged in successfully 
	
	Examples: 
		|userName|password|
		|test001@test.com|test001|
        |test002@test.com|test002|
        |test003@test.com|test003|
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
