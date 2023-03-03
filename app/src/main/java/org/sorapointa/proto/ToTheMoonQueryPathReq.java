package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ToTheMoonQueryPathReq {
    public enum OptionType {
        @Tag(tag=0) OPTION_TYPE_NONE ,
        @Tag(tag=1) OPTION_TYPE_NORMAL ;
    }

    public enum AStarMethod {
        @Tag(tag=0) A_STAR_METHOD_CLASSIC ,
        @Tag(tag=1) A_STAR_METHOD_TENDENCY ,
        @Tag(tag=2) A_STAR_METHOD_ADAPTIVE ,
        @Tag(tag=3) A_STAR_METHOD_INFLECTION ;
    }

    public enum FilterType {
        @Tag(tag=0) FILTER_TYPE_ALL ,
        @Tag(tag=1) FILTER_TYPE_AIR ,
        @Tag(tag=2) FILTER_TYPE_WATER ;
    }

    @Tag(tag=9) public Vector destinationPos = null;
    @Tag(tag=15,isSigned=true) public Integer fuzzyRange = null;
    @Tag(tag=8) public OptionType queryType = null;
    @Tag(tag=1) public AStarMethod astarMethod = null;
    @Tag(tag=6) public Integer sceneId = null;
    @Tag(tag=11,isSigned=true) public Integer queryId = null;
    @Tag(tag=3) public FilterType filterType = null;
    @Tag(tag=13) public Boolean refined = null;
    @Tag(tag=5) public Boolean useFullNeighbor = null;
    @Tag(tag=10) public Vector sourcePos = null;
}
