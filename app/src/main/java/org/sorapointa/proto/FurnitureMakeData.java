package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FurnitureMakeData {
    @Tag(tag=15) public Integer index = null;
    @Tag(tag=1) public Integer durTime = null;
    @Tag(tag=11,isFixed=true) public Integer beginTime = null;
    @Tag(tag=6,isFixed=true) public Integer accelerateTime = null;
    @Tag(tag=2) public Integer avatarId = null;
    @Tag(tag=5) public Integer makeId = null;
}
