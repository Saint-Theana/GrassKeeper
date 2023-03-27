package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AttackResultCreateCount {
    @Tag(tag=4) public List<Integer> createCountNoCostList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> createCountList = new ArrayList<>();
}
