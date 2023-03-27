package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SceneSurfaceMaterial {
        @Tag(tag=0) Invalid ,
        @Tag(tag=1) Grass ,
        @Tag(tag=2) Dirt ,
        @Tag(tag=3) Rock ,
        @Tag(tag=4) Snow ,
        @Tag(tag=5) Water ,
        @Tag(tag=6) Tile ,
        @Tag(tag=7) Sand ;
}
