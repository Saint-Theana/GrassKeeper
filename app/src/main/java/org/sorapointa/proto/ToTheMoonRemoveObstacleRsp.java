package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DynamicNodes.*;
import org.sorapointa.proto.DynamicNodes;

public class ToTheMoonRemoveObstacleRsp {
    @Tag(tag=3,isSigned=true) public Integer queryId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public DynamicNodes dynamicNodes = null;
}
