package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterMonsterDetail {
    @Tag(tag=9,isFloat=true) public Float curHpPercentage = null;
    @Tag(tag=10) public Integer fungusId = null;
    @Tag(tag=12) public Boolean isAlive = null;
}
