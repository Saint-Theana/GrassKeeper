package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SceneSurfaceMaterial {
        @Tag(tag=0) SCENE_SURFACE_MATERIAL_INVALID ,
        @Tag(tag=1) SCENE_SURFACE_MATERIAL_GRASS ,
        @Tag(tag=2) SCENE_SURFACE_MATERIAL_DIRT ,
        @Tag(tag=3) SCENE_SURFACE_MATERIAL_ROCK ,
        @Tag(tag=4) SCENE_SURFACE_MATERIAL_SNOW ,
        @Tag(tag=5) SCENE_SURFACE_MATERIAL_WATER ,
        @Tag(tag=6) SCENE_SURFACE_MATERIAL_TILE ,
        @Tag(tag=7) SCENE_SURFACE_MATERIAL_SAND ;
}
