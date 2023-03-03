package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtAvatarStandUpNotify {
    @Tag(tag=11) public Long chairId = null;
    @Tag(tag=6,isSigned=true) public Integer performId = null;
    @Tag(tag=1,isSigned=true) public Integer direction = null;
    @Tag(tag=9) public Integer entityId = null;
}
