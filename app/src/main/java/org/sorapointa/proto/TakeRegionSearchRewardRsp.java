package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeRegionSearchRewardRsp {
    @Tag(tag=14) public Integer searchId = null;
    @Tag(tag=1) public Integer id = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
