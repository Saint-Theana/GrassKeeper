package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterTrainingSelectFungusReq {
    @Tag(tag=11) public List<Integer> backupFungusIdList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> fightFungusIdList = new ArrayList<>();
}
