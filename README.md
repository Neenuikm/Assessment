
Create a REST API endpoint for the Voucher model that allows for the following
   operations:
- POST /voucher - Create a new Voucher
  Data Validations:
- name cannot be empty
- address cannot be empty
- headid cannot be empty
- amount cannot be empty
  Return bad request on validation error
  Return 201 response code with the product id as the response on succes