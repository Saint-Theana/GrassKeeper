package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OptionType.*;
import org.sorapointa.proto.OptionType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.AStarMethod.*;
import org.sorapointa.proto.AStarMethod;
import org.sorapointa.proto.FilterType.*;
import org.sorapointa.proto.FilterType;

public class ToTheMoonQueryPathReq {
    public enum MAJKIHKKGFG {
        @Tag(tag=0) None ,
        @Tag(tag=6105) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer queryType = null;
    @Tag(tag=3,isSigned=true) public Integer queryId = null;
    @Tag(tag=12) public Vector sourcePos = null;
    @Tag(tag=6) public Integer sceneId = null;
    @Tag(tag=1) public Integer astarMethod = null;
    @Tag(tag=8) public Integer filterType = null;
    @Tag(tag=7,isSigned=true) public Integer fuzzyRange = null;
    @Tag(tag=10) public Boolean refined = null;
    @Tag(tag=2) public Boolean useFullNeighbor = null;
    @Tag(tag=5) public Vector destinationPos = null;
}
