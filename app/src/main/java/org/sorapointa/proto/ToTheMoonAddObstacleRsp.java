package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DynamicNodes.*;
import org.sorapointa.proto.DynamicNodes;

public class ToTheMoonAddObstacleRsp {
    @Tag(tag=2) public DynamicNodes dynamicNodes = null;
    @Tag(tag=13,isSigned=true) public Integer queryId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
