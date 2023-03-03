package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeFurnitureMakeReq {
    @Tag(tag=8) public Integer index = null;
    @Tag(tag=12) public Boolean isFastFinish = null;
    @Tag(tag=7) public Integer makeId = null;
}
