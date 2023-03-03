package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerInviteNotify {
    @Tag(tag=12) public Integer cd = null;
    @Tag(tag=13) public Integer mpPlayId = null;
    @Tag(tag=10) public Boolean isRemainReward = null;
}
