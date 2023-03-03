package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeoffEquipReq {
    @Tag(tag=8) public Long avatarGuid = null;
    @Tag(tag=15) public Integer slot = null;
}
