package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GearActivityFinishPlayGearRsp {
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Boolean isSuccess = null;
    @Tag(tag=3) public Integer levelId = null;
}
