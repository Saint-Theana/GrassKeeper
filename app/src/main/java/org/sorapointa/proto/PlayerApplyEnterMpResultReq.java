package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpResultReq {
    @Tag(tag=2) public Integer applyUid = null;
    @Tag(tag=12) public Boolean isAgreed = null;
}
