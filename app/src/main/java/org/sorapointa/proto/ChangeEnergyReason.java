package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ChangeEnergyReason {
        @Tag(tag=0) ChangeEnergyNone ,
        @Tag(tag=1) ChangeEnergySkillStart ;
}
