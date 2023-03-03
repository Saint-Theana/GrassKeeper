package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialGetDungeonExhibitionDataRsp {
    @Tag(tag=12) public Integer trialId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
