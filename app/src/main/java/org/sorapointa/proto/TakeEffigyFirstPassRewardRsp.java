package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeEffigyFirstPassRewardRsp {
    @Tag(tag=2) public Integer challengeId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
