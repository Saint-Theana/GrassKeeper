package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AdjustWorldLevelRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer cdOverTime = null;
    @Tag(tag=14) public Integer afterWorldLevel = null;
}
