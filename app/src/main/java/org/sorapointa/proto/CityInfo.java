package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityInfo {
    @Tag(tag=15) public Integer cityId = null;
    @Tag(tag=3) public Integer crystalNum = null;
    @Tag(tag=4) public Integer level = null;
}
