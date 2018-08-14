<script src="/assets/jquery/dynamic_loading.js"></script>
<%
    String check = (String) request.getAttribute("colors");
    if(check != null && !check.equals("")){
%>
        <script >
            var colors = "<%=request.getAttribute("colors") %>"
            $(document).ready(handleColors.incoming(colors));
        </script>
<%
    }
    else{
        %><script>$(document).ready(handleColors.cookie());</script><%
    }
%>
