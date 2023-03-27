package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationSimpleInfo {
    @Tag(tag=10) public Integer level = null;
    @Tag(tag=8) public Integer cityId = null;
}
