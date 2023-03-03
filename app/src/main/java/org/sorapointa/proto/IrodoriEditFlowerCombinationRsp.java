package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriEditFlowerCombinationRsp {
    @Tag(tag=4) public Boolean isAlreadyFinished = null;
    @Tag(tag=3) public Boolean isCanTakeReward = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
