package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FurnitureMakeData {
    @Tag(tag=5) public Integer durTime = null;
    @Tag(tag=6) public Integer makeId = null;
    @Tag(tag=13) public Integer beginTime = null;
    @Tag(tag=9) public Integer accelerateTime = null;
    @Tag(tag=10) public Integer index = null;
    @Tag(tag=1) public Integer avatarId = null;
}
