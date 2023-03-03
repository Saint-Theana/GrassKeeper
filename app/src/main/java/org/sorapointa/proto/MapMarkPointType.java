package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MapMarkPointType {
        @Tag(tag=0) MAP_MARK_POINT_TYPE_NPC ,
        @Tag(tag=1) MAP_MARK_POINT_TYPE_QUEST ,
        @Tag(tag=2) MAP_MARK_POINT_TYPE_SPECIAL ,
        @Tag(tag=3) MAP_MARK_POINT_TYPE_MINE ,
        @Tag(tag=4) MAP_MARK_POINT_TYPE_COLLECTION ,
        @Tag(tag=5) MAP_MARK_POINT_TYPE_MONSTER ,
        @Tag(tag=6) MAP_MARK_POINT_TYPE_FISH_POOL ;
}
