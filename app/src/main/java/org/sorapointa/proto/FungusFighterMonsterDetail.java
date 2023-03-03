package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterMonsterDetail {
    @Tag(tag=2) public Integer fungusId = null;
    @Tag(tag=7,isFloat=true) public Float curHpPercentage = null;
    @Tag(tag=9) public Boolean isAlive = null;
}
