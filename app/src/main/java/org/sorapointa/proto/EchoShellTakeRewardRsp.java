package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EchoShellTakeRewardRsp {
    @Tag(tag=6) public Integer rewardId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
