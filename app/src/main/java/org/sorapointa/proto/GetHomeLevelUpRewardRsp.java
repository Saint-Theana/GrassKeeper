package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetHomeLevelUpRewardRsp {
    @Tag(tag=1) public Integer level = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
