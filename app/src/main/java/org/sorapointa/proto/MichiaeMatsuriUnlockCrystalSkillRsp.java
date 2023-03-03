package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MichiaeMatsuriUnlockCrystalSkillRsp {
    @Tag(tag=1) public Integer crystalSkillId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
