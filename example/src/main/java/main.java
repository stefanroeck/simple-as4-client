import dk.toldst.eutk.as4client.As4Client;
import dk.toldst.eutk.as4client.builder.support.As4ClientBuilderInstance;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class main {
    public static void main(String[] args) throws IOException, TransformerException {
        As4Client client = new As4ClientBuilderInstance().builder().
            setEndpoint(new URL("http://localhost:8384/exchange/CVR_13116482_UID_50151991"))
                .setCrypto("as4crypto-holodeck.properties")
                .setUserNameTokenDetails("CVR_13116482_UID_50151991", "HBNRsvph68").
                build();

        String res = client.executePush("DMS.Import", "Declaration.Submit","PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/Pgo8bnMyOkRlY2xhcmF0aW9uIHhtbG5zPSJ1cm46d2NvOmRhdGFtb2RlbDpXQ086RGVjbGFyYXRpb25fRFM6RE1TOjIiIHhtbG5zOm5zMj0idXJuOndjbzpkYXRhbW9kZWw6V0NPOkRFQy1ETVM6MiI+CiAgICA8bnMyOkZ1bmN0aW9uQ29kZT45PC9uczI6RnVuY3Rpb25Db2RlPgogICAgPG5zMjpQcm9jZWR1cmVDYXRlZ29yeT5INzwvbnMyOlByb2NlZHVyZUNhdGVnb3J5PgogICAgPG5zMjpGdW5jdGlvbmFsUmVmZXJlbmNlSUQ+Q0JNVXNlckNyZWRUZXN0OTwvbnMyOkZ1bmN0aW9uYWxSZWZlcmVuY2VJRD4KICAgIDxuczI6VHlwZUNvZGU+SU1BPC9uczI6VHlwZUNvZGU+CiAgICA8bnMyOkdvb2RzSXRlbVF1YW50aXR5PjE8L25zMjpHb29kc0l0ZW1RdWFudGl0eT4KICAgIDxuczI6RGVjbGFyYXRpb25PZmZpY2VJRD5ESzAwMzEwMzwvbnMyOkRlY2xhcmF0aW9uT2ZmaWNlSUQ+CiAgICA8bnMyOlRvdGFsR3Jvc3NNYXNzTWVhc3VyZT4xLjU8L25zMjpUb3RhbEdyb3NzTWFzc01lYXN1cmU+IAogICAgPG5zMjpTdWJtaXR0ZXI+CiAgICAgICAgPG5zMjpOYW1lPjEzMTE2NDgyPC9uczI6TmFtZT4KICAgICAgICA8bnMyOklEPjEzMTE2NDgyPC9uczI6SUQ+CiAgICA8L25zMjpTdWJtaXR0ZXI+CiAgICA8bnMyOkFnZW50PgogICAgICAgPG5zMjpJRD5ESzEzNDIxNzMwPC9uczI6SUQ+CiAgICAgICAgPG5zMjpGdW5jdGlvbkNvZGU+MjwvbnMyOkZ1bmN0aW9uQ29kZT4KICAgIDwvbnMyOkFnZW50PgogICAgPG5zMjpEZWNsYXJhbnQ+CiAgICAgICAgPG5zMjpOYW1lPkRlY2xhcmFudCBOYW1lPC9uczI6TmFtZT4KICAgICAgICAgICAgPG5zMjpJRD5ESzA5OTk5OTgxPC9uczI6SUQ+CiAgICAgICAgICAgIDxuczI6QWRkcmVzcz4KICAgICAgICAgICAgICAgICAgICA8bnMyOkNpdHlOYW1lPkNvcGVuaGFnZW48L25zMjpDaXR5TmFtZT4KICAgICAgICAgICAgICAgICAgICA8bnMyOkNvdW50cnlDb2RlPkRLPC9uczI6Q291bnRyeUNvZGU+CiAgICAgICAgICAgICAgICAgICAgPG5zMjpMaW5lPkNvcGVuaGFnZW4gQ2l0eSBjZW50cmUgMTIzPC9uczI6TGluZT4KICAgICAgICAgICAgICAgICAgICA8bnMyOlBvc3Rjb2RlSUQ+OTkyMjwvbnMyOlBvc3Rjb2RlSUQ+CiAgICAgICAgICAgIDwvbnMyOkFkZHJlc3M+CiAgICA8L25zMjpEZWNsYXJhbnQ+CiAgICA8bnMyOkV4cG9ydGVyPgogICAgICAgIDxuczI6TmFtZT5FeHBvcnRlciBOYW1lPC9uczI6TmFtZT4KICAgICAgICA8bnMyOkFkZHJlc3M+CiAgICAgICAgICAgIDxuczI6Q2l0eU5hbWU+T3NsbzwvbnMyOkNpdHlOYW1lPgogICAgICAgICAgICA8bnMyOkNvdW50cnlDb2RlPk5PPC9uczI6Q291bnRyeUNvZGU+CiAgICAgICAgICAgIDxuczI6TGluZT5TdHJlZXQgQWRkcmVzczwvbnMyOkxpbmU+CiAgICAgICAgICAgIDxuczI6UG9zdGNvZGVJRD4xMzQ1PC9uczI6UG9zdGNvZGVJRD4KICAgICAgICA8L25zMjpBZGRyZXNzPgogICAgPC9uczI6RXhwb3J0ZXI+CiAgICA8bnMyOkdvb2RzU2hpcG1lbnQ+CiAgICAgICAgPG5zMjpDb25zaWdubWVudD4KICAgICAgICAgICAgPG5zMjpHb29kc0xvY2F0aW9uPgogICAgICAgICAgICAgICAgPG5zMjpOYW1lPkRLRkRIPC9uczI6TmFtZT4KICAgICAgICAgICAgICAgIDxuczI6SUQ+MDAwMzwvbnMyOklEPgogICAgICAgICAgICAgICAgPG5zMjpUeXBlQ29kZT5BPC9uczI6VHlwZUNvZGU+CiAgICAgICAgICAgICAgICA8bnMyOkFkZHJlc3M+CiAgICAgICAgICAgICAgICAgICAgPG5zMjpUeXBlQ29kZT5VPC9uczI6VHlwZUNvZGU+CiAgICAgICAgICAgICAgICA8IS0tPiAgICA8bnMyOkNpdHlOYW1lPkNvcGVuaGFnZW48L25zMjpDaXR5TmFtZT4gLS0+CiAgICAgICAgICAgICAgICAgICAgPG5zMjpDb3VudHJ5Q29kZT5ESzwvbnMyOkNvdW50cnlDb2RlPiAKICAgICAgICAgICAgICAgIDwhLS0+ICAgIDxuczI6TGluZT5Db3BlbmhhZ2VuIGRvY2sgMTIzPC9uczI6TGluZT4KICAgICAgICAgICAgICAgICAgICA8bnMyOlBvc3Rjb2RlSUQ+MTI4OTwvbnMyOlBvc3Rjb2RlSUQ+IC0tPgogICAgICAgICAgICAgICAgPC9uczI6QWRkcmVzcz4KICAgICAgICAgICAgPC9uczI6R29vZHNMb2NhdGlvbj4KICAgICAgICA8L25zMjpDb25zaWdubWVudD4KICAgICAgICA8bnMyOkN1c3RvbXNWYWx1YXRpb24+CiAgICAgICAgICAgIDxuczI6RnJlaWdodENoYXJnZUFtb3VudCBjdXJyZW5jeUlEPSJES0siPjE0MS42NDwvbnMyOkZyZWlnaHRDaGFyZ2VBbW91bnQ+CiAgICAgICAgPC9uczI6Q3VzdG9tc1ZhbHVhdGlvbj4KICAgICAgICA8bnMyOkdvdmVybm1lbnRBZ2VuY3lHb29kc0l0ZW0+CiAgICAgICAgICAgIDxuczI6Q3VzdG9tc1ZhbHVlQW1vdW50IGN1cnJlbmN5SUQ9IkRLSyI+MTM5LjUzPC9uczI6Q3VzdG9tc1ZhbHVlQW1vdW50PgogICAgICAgICAgICA8bnMyOlNlcXVlbmNlTnVtZXJpYz4xPC9uczI6U2VxdWVuY2VOdW1lcmljPgogICAgICAgICAgICA8bnMyOkNvbW1vZGl0eT4KICAgICAgICAgICAgICAgIDxuczI6RGVzY3JpcHRpb24+U2luZ2xlIGZvY3VzIHNwZWN0YWNsZSBsZW5zZXMgb2YgZ2xhc3MuPC9uczI6RGVzY3JpcHRpb24+CiAgICAgICAgICAgICAgICA8bnMyOkNsYXNzaWZpY2F0aW9uPgogICAgICAgICAgICAgICAgICAgICAgICAgICAgPG5zMjpTZXF1ZW5jZU51bWVyaWM+MTwvbnMyOlNlcXVlbmNlTnVtZXJpYz4KICAgICAgICAgICAgICAgICAgICA8bnMyOklEPjkwMDE0MDwvbnMyOklEPgogICAgICAgICAgICAgICAgICAgIDxuczI6SWRlbnRpZmljYXRpb25UeXBlQ29kZT5UU1A8L25zMjpJZGVudGlmaWNhdGlvblR5cGVDb2RlPgogICAgICAgICAgICAgICAgPC9uczI6Q2xhc3NpZmljYXRpb24+CiAgICAgICAgICAgICAgICA8bnMyOkdvb2RzTWVhc3VyZT4KICAgICAgICAgICAgICAgICAgICA8bnMyOkdyb3NzTWFzc01lYXN1cmU+MS41PC9uczI6R3Jvc3NNYXNzTWVhc3VyZT4KICAgICAgICAgICAgICAgIDwvbnMyOkdvb2RzTWVhc3VyZT4KICAgICAgICAgICAgPC9uczI6Q29tbW9kaXR5PgogICAgICAgICAgICA8bnMyOkN1c3RvbXNWYWx1YXRpb24+CiAgICAgICAgICAgICAgICA8bnMyOkZyZWlnaHRDaGFyZ2VBbW91bnQgY3VycmVuY3lJRD0iREtLIj4xNDEuNjQ8L25zMjpGcmVpZ2h0Q2hhcmdlQW1vdW50PgogICAgICAgICAgICA8L25zMjpDdXN0b21zVmFsdWF0aW9uPgogICAgICAgICAgICA8bnMyOkdvdmVybm1lbnRQcm9jZWR1cmU+CiAgICAgICAgICAgICAgICAgICAgICAgIDxuczI6U2VxdWVuY2VOdW1lcmljPjE8L25zMjpTZXF1ZW5jZU51bWVyaWM+CiAgICAgICAgICAgICAgICA8bnMyOkN1cnJlbnRDb2RlPjQwPC9uczI6Q3VycmVudENvZGU+CiAgICAgICAgICAgICAgICA8bnMyOlByZXZpb3VzQ29kZT4wMDwvbnMyOlByZXZpb3VzQ29kZT4KICAgICAgICAgICAgPC9uczI6R292ZXJubWVudFByb2NlZHVyZT4KICAgICAgICAgICAgPG5zMjpHb3Zlcm5tZW50UHJvY2VkdXJlPgogICAgICAgICAgICAgICAgPG5zMjpTZXF1ZW5jZU51bWVyaWM+MjwvbnMyOlNlcXVlbmNlTnVtZXJpYz4KICAgICAgICAgICAgICAgIDxuczI6Q3VycmVudENvZGU+QzA4PC9uczI6Q3VycmVudENvZGU+CiAgICAgICAgICAgIDwvbnMyOkdvdmVybm1lbnRQcm9jZWR1cmU+CiAgIDwhLS0gICAgICAgICA8bnMyOkdvdmVybm1lbnRQcm9jZWR1cmU+CiAgICAgICAgICAgICAgICA8bnMyOlNlcXVlbmNlTnVtZXJpYz4zPC9uczI6U2VxdWVuY2VOdW1lcmljPgogICAgICAgICAgICAgICAgPG5zMjpDdXJyZW50Q29kZT5GNDk8L25zMjpDdXJyZW50Q29kZT4KICAgICAgICAgICAgPC9uczI6R292ZXJubWVudFByb2NlZHVyZT4gLS0+CiAgICAgICAgICAgIDxuczI6UGFja2FnaW5nPgogICAgICAgICAgICAgICAgPG5zMjpTZXF1ZW5jZU51bWVyaWM+MTwvbnMyOlNlcXVlbmNlTnVtZXJpYz4KICAgICAgICAgICAgICAgIDxuczI6UXVhbnRpdHlRdWFudGl0eT4xPC9uczI6UXVhbnRpdHlRdWFudGl0eT4KICAgICAgICAgICAgPC9uczI6UGFja2FnaW5nPgogICAgICAgICAgICA8bnMyOlByZXZpb3VzRG9jdW1lbnQ+CiAgICAgICAgICAgICAgICA8bnMyOlNlcXVlbmNlTnVtZXJpYz4xPC9uczI6U2VxdWVuY2VOdW1lcmljPgogICAgICAgICAgICAgICAgPG5zMjpDYXRlZ29yeUNvZGU+WTwvbnMyOkNhdGVnb3J5Q29kZT4KICAgICAgICAgICAgICAgIDxuczI6SUQ+SUQxMzwvbnMyOklEPgogICAgICAgICAgICAgICAgPG5zMjpUeXBlQ29kZT4zODA8L25zMjpUeXBlQ29kZT4KICAgICAgICAgICAgICAgIDxuczI6TGluZU51bWVyaWM+MTwvbnMyOkxpbmVOdW1lcmljPgogICAgICAgICAgICA8L25zMjpQcmV2aW91c0RvY3VtZW50PgogICAgICAgIDwvbnMyOkdvdmVybm1lbnRBZ2VuY3lHb29kc0l0ZW0+CiAgICAgICAgPG5zMjpJbXBvcnRlcj4KICAgICAgICAgICAgPG5zMjpOYW1lPkltcG9ydGVyIE5hbWU8L25zMjpOYW1lPgogICAgICAgICAgICA8bnMyOklEPkRLMDk5OTk5ODE8L25zMjpJRD4KICAgICAgICAgICAgPG5zMjpBZGRyZXNzPgogICAgICAgICAgICAgICAgICAgIDxuczI6Q2l0eU5hbWU+Q29wZW5oYWdlbjwvbnMyOkNpdHlOYW1lPgogICAgICAgICAgICAgICAgICAgIDxuczI6Q291bnRyeUNvZGU+REs8L25zMjpDb3VudHJ5Q29kZT4KICAgICAgICAgICAgICAgICAgICA8bnMyOkxpbmU+Q29wZW5oYWdlbiBDaXR5IGNlbnRyZSAxMjM8L25zMjpMaW5lPgogICAgICAgICAgICAgICAgICAgIDxuczI6UG9zdGNvZGVJRD45OTIyPC9uczI6UG9zdGNvZGVJRD4KICAgICAgICAgICAgPC9uczI6QWRkcmVzcz4KICAgICAgICA8L25zMjpJbXBvcnRlcj4KICAgIDwvbnMyOkdvb2RzU2hpcG1lbnQ+CjwvbnMyOkRlY2xhcmF0aW9uPg==");

        System.out.println(res);


    }
}
