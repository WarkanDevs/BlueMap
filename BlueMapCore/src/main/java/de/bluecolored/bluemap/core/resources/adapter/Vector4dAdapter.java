package de.bluecolored.bluemap.core.resources.adapter;

import com.flowpowered.math.vector.Vector4d;
import com.flowpowered.math.vector.Vector4f;
import com.flowpowered.math.vector.Vector4i;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class Vector4dAdapter extends TypeAdapter<Vector4d> {

    @Override
    public void write(JsonWriter out, Vector4d value) throws IOException {
        out.beginArray();
        out.value(value.getX());
        out.value(value.getY());
        out.value(value.getZ());
        out.value(value.getW());
        out.endArray();
    }

    @Override
    public Vector4d read(JsonReader in) throws IOException {
        in.beginArray();
        Vector4d value = new Vector4d(
                in.nextDouble(),
                in.nextDouble(),
                in.nextDouble(),
                in.nextDouble()
        );
        in.endArray();
        return value;
    }

}