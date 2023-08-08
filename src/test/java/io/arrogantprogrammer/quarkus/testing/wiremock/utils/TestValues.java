package io.arrogantprogrammer.quarkus.testing.wiremock.utils;

public class TestValues {

    public static final String API_URL = "https://v3.football.api-sports.io/fixtures";
    public static final String API_AUTH_KEY = "x-apisports-key";
    public static final String API_AUTH_VALUE = "2b36a6fgc9bd0fmwd6b31d9c63adc0c8";

    public static final String RESPONSE_FIXTURES = """
                {
                    "get": "fixtures",
                    "parameters": {
                        "league": "39",
                        "season": "2023",
                        "date": "2023-08-11"
                    },
                    "errors": [],
                    "results": 1,
                    "paging": {
                        "current": 1,
                        "total": 1
                    },
                    "response": [
                        {
                            "fixture": {
                                "id": 1035037,
                                "referee": null,
                                "timezone": "UTC",
                                "date": "2023-08-11T19:00:00+00:00",
                                "timestamp": 1691780400,
                                "periods": {
                                    "first": null,
                                    "second": null
                                },
                                "venue": {
                                    "id": 512,
                                    "name": "Turf Moor",
                                    "city": "Burnley"
                                },
                                "status": {
                                    "long": "Not Started",
                                    "short": "NS",
                                    "elapsed": null
                                }
                            },
                            "league": {
                                "id": 39,
                                "name": "Premier League",
                                "country": "England",
                                "logo": "https://media-3.api-sports.io/football/leagues/39.png",
                                "flag": "https://media-2.api-sports.io/flags/gb.svg",
                                "season": 2023,
                                "round": "Regular Season - 1"
                            },
                            "teams": {
                                "home": {
                                    "id": 44,
                                    "name": "Burnley",
                                    "logo": "https://media-3.api-sports.io/football/teams/44.png",
                                    "winner": null
                                },
                                "away": {
                                    "id": 50,
                                    "name": "Manchester City",
                                    "logo": "https://media-3.api-sports.io/football/teams/50.png",
                                    "winner": null
                                }
                            },
                            "goals": {
                                "home": null,
                                "away": null
                            },
                            "score": {
                                "halftime": {
                                    "home": null,
                                    "away": null
                                },
                                "fulltime": {
                                    "home": null,
                                    "away": null
                                },
                                "extratime": {
                                    "home": null,
                                    "away": null
                                },
                                "penalty": {
                                    "home": null,
                                    "away": null
                                }
                            }
                        }
                    ]
                }
            """;

    public static final String RESPONSE_STANDINGS = """
            """;
}
