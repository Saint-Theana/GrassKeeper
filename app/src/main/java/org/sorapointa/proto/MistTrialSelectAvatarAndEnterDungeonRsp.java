package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialSelectAvatarAndEnterDungeonRsp {
    @Tag(tag=1) public Integer trialId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
