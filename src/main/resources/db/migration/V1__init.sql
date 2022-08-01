create user vinnie;

create table fantasy_football.teams
(
	id uuid not null
		constraint teams_pk
			primary key,
	name text not null,
	image_id uuid,
	bye_week integer
);

alter table fantasy_football.teams owner to vinnie;

create unique index teams_id_uindex
	on fantasy_football.teams (id);

create index teams_name_index
	on fantasy_football.teams (name);

create table fantasy_football.players
(
	id uuid not null
		constraint players_pk
			primary key,
	name text not null,
	position text not null,
	team_id uuid
		constraint players_teams_id_fk
			references fantasy_football.teams,
	image_id text,
	bye_week integer not null
);

alter table fantasy_football.players owner to vinnie;

create index players_name_index
	on fantasy_football.players (name);

create index players_team_index
	on fantasy_football.players (team_id);

create unique index players_id_uindex
	on fantasy_football.players (id);


