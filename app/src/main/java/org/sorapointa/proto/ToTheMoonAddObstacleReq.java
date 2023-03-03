package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ToTheMoonObstacleInfo.*;
import org.sorapointa.proto.ToTheMoonObstacleInfo;

public class ToTheMoonAddObstacleReq {
    @Tag(tag=12) public Boolean useEdge = null;
    @Tag(tag=13) public ToTheMoonObstacleInfo obstacle = null;
    @Tag(tag=9,isSigned=true) public Integer queryId = null;
    @Tag(tag=3) public Integer sceneId = null;
}
