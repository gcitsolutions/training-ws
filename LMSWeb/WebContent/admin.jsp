<%@include file="menu.jsp" %>
<script>
	function openMenu(id) {
		var elem = document.getElementById(id); 
		if(elem.style.display=="block")
			elem.style.display="none";
		else
			elem.style.display="block";
	}
</script>

    <div class="container">
		<h4><a href="javascript:openMenu('admin');">Administrator</a></h4>
		<div id="admin" style="display:none;">
			<h4>&emsp;&emsp;<a href="javascript:openMenu('author');">Author</a></h4>
			<div id="author" style="display:none;">
				<h5>&emsp;&emsp;&emsp;&emsp;<a href="javascript:openMenu('addAuthor');">Add Author</a></h5>
				<div id="addAuthor" style="display:none;">
					<form action="addAuthor" method="post">
						<h4>Add Author</h4>
						Author Name: <input type="text" name="authorName" />
						<input type="submit"/>
					</form>
				</div>
				
				<h5>&emsp;&emsp;&emsp;&emsp;<a href="listAuthors.jsp">List Authors</a></h5>
			</div>
		</div>
	</div>
</body>
</html>