package com.example.qrun;

import androidx.annotation.NonNull;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class CommentStorage extends Storage {
    /**
     * Initialize Comment Storage
     * @param db Firestore Instance
     */
    public CommentStorage(FirebaseFirestore db) {
        super(db,"Comment");
    }

    /**
     * create new document with autogenerated id
     * @param value document fields
     * @param comp store if accomplished
     */
    public void add(HashMap<?, ?> value, @NonNull StoreOnComplete comp) {
        String id = this.getCol().document().getId();
        this.add(id, value, comp);
    }

}
