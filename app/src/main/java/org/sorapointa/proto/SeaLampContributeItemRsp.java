package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampContributeItemRsp {
    @Tag(tag=7) public Integer addContribution = null;
    @Tag(tag=1) public Integer addProgress = null;
    @Tag(tag=14) public Integer totalContribution = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
