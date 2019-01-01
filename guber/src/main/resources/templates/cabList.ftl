<!DOCTYPE html>
	<html lang="en">
		<body>
		<h2>List of cabs</h2>
		
		<table border=1>
			<thead>
				<tr>
					<th>Manufacture Year</th><th>Car make</th><th>Licence Plate</th><th>Capacity</th><th>Has Baby Chair</th>
				</tr>
			</thead>
			<tbody>
			<#list cabs as cab>
				<tr>
					<td>${cab.manufactureYear}</td>
					<td>${cab.carMake}</td>
					<td>${cab.licencePlate}</td>
					<td>${cab.capacity}</td>
					<td>${cab.hasBabyChair?string('yes','no')}</td>
				</tr>
			</#list>
			</tbody>
		</table>
		</body>
		
	</html>