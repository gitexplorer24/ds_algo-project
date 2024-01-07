@graph
Feature: Graph feature

@graph1
  Scenario: user selects graph item and runs the code
    Given user is in Homepage after logged in
    When The user selects Graph item from the drop down menu and should be directed to "Graph" Page
    Then The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
@graph2   
Scenario: user selects graph representations and runs the code
   Given The user navigates back and clicks "Graph Representations" button on the GR page
   Then  The user clicks "Try Here" button on GraphRepresentations page
   Then The user should be redirected to tryEditor with a Run button to test   
   

