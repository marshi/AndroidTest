package application.android.marshi.androidtest.repository;


import application.android.marshi.androidtest.model.Note;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author mukai_masaki on 2016/03/18.
 * Copyright: CYBER AGNET. INC
 */
public interface RestApi {

	@GET("/notes/{id}")
	Observable<Note> get(@Path("id") int id);

}
