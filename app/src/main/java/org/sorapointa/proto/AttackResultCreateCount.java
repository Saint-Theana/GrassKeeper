package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AttackResultCreateCount {
    @Tag(tag=10) public List<Integer> createCountList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> createCountNoCostList = new ArrayList<>();
}
