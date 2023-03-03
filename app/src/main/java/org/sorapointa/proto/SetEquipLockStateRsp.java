package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetEquipLockStateRsp {
    @Tag(tag=14) public Long targetEquipGuid = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Boolean isLocked = null;
}
