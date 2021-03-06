/*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Definition of the class representing international telephone numbers. This class is hand created
 * based on the class file compiled from phonenumber.proto. Please refer to that file for detailed
 * descriptions of the meaning of each field.
 */

package com.google.i18n.phonenumbers;

public final class Phonenumber {
  private Phonenumber() {}
  public static class PhoneNumber {
    public enum CountryCodeSource {
      FROM_NUMBER_WITH_PLUS_SIGN,
      FROM_NUMBER_WITH_IDD,
      FROM_NUMBER_WITHOUT_PLUS_SIGN,
      FROM_DEFAULT_COUNTRY
    }

    public PhoneNumber() {
      countryCodeSource_ = CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
    }

    // required int32 country_code = 1;
    private boolean hasCountryCode;
    private int countryCode_ = 0;
    public boolean hasCountryCode() { return hasCountryCode; }
    public int getCountryCode() { return countryCode_; }
    public PhoneNumber setCountryCode(int value) {
      hasCountryCode = true;
      countryCode_ = value;
      return this;
    }
    public PhoneNumber clearCountryCode() {
      hasCountryCode = false;
      countryCode_ = 0;
      return this;
    }

    // required uint64 national_number = 2;
    private boolean hasNationalNumber;
    private long nationalNumber_ = 0L;
    public boolean hasNationalNumber() { return hasNationalNumber; }
    public long getNationalNumber() { return nationalNumber_; }
    public PhoneNumber setNationalNumber(long value) {
      hasNationalNumber = true;
      nationalNumber_ = value;
      return this;
    }
    public PhoneNumber clearNationalNumber() {
      hasNationalNumber = false;
      nationalNumber_ = 0L;
      return this;
    }

    // optional string extension = 3;
    private boolean hasExtension;
    private java.lang.String extension_ = "";
    public boolean hasExtension() { return hasExtension; }
    public String getExtension() { return extension_; }
    public PhoneNumber setExtension(String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      hasExtension = true;
      extension_ = value;
      return this;
    }
    public PhoneNumber clearExtension() {
      hasExtension = false;
      extension_ = "";
      return this;
    }

    // optional bool italian_leading_zero = 4;
    private boolean hasItalianLeadingZero;
    private boolean italianLeadingZero_ = false;
    public boolean hasItalianLeadingZero() { return hasItalianLeadingZero; }
    public boolean getItalianLeadingZero() { return italianLeadingZero_; }
    public PhoneNumber setItalianLeadingZero(boolean value) {
      hasItalianLeadingZero = true;
      italianLeadingZero_ = value;
      return this;
    }
    public PhoneNumber clearItalianLeadingZero() {
      hasItalianLeadingZero = false;
      italianLeadingZero_ = false;
      return this;
    }

    // optional string raw_input = 5;
    private boolean hasRawInput;
    private String rawInput_ = "";
    public boolean hasRawInput() { return hasRawInput; }
    public String getRawInput() { return rawInput_; }
    public PhoneNumber setRawInput(String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      hasRawInput = true;
      rawInput_ = value;
      return this;
    }
    public PhoneNumber clearRawInput() {
      hasRawInput = false;
      rawInput_ = "";
      return this;
    }

    // optional CountryCodeSource country_code_source = 6;
    private boolean hasCountryCodeSource;
    private CountryCodeSource countryCodeSource_;
    public boolean hasCountryCodeSource() { return hasCountryCodeSource; }
    public CountryCodeSource getCountryCodeSource() { return countryCodeSource_; }
    public PhoneNumber setCountryCodeSource(CountryCodeSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      hasCountryCodeSource = true;
      countryCodeSource_ = value;
      return this;
    }
    public PhoneNumber clearCountryCodeSource() {
      hasCountryCodeSource = false;
      countryCodeSource_ = CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
      return this;
    }

    public final PhoneNumber clear() {
      clearCountryCode();
      clearNationalNumber();
      clearExtension();
      clearItalianLeadingZero();
      clearRawInput();
      clearCountryCodeSource();
      return this;
    }

    public PhoneNumber mergeFrom(PhoneNumber other) {
      if (other.hasCountryCode()) {
        setCountryCode(other.getCountryCode());
      }
      if (other.hasNationalNumber()) {
        setNationalNumber(other.getNationalNumber());
      }
      if (other.hasExtension()) {
        setExtension(other.getExtension());
      }
      if (other.hasItalianLeadingZero()) {
        setItalianLeadingZero(other.getItalianLeadingZero());
      }
      if (other.hasRawInput()) {
        setRawInput(other.getRawInput());
      }
      if (other.hasCountryCodeSource()) {
        setCountryCodeSource(other.getCountryCodeSource());
      }
      return this;
    }

    public boolean exactlySameAs(PhoneNumber other) {
      return (countryCode_ == other.countryCode_ && nationalNumber_ == other.nationalNumber_ &&
          extension_.equals(other.extension_) && italianLeadingZero_ == other.italianLeadingZero_ &&
          rawInput_.equals(other.rawInput_) && countryCodeSource_ == other.countryCodeSource_);
    }

    @Override
    public String toString() {
      StringBuffer outputString = new StringBuffer();
      outputString.append("Country Code: ").append(countryCode_);
      outputString.append(" National Number: ").append(nationalNumber_);
      if (hasItalianLeadingZero() && getItalianLeadingZero()) {
        outputString.append(" Leading Zero: true");
      }
      if (hasExtension()) {
        outputString.append(" Extension: ").append(extension_);
      }
      if (hasCountryCodeSource()) {
        outputString.append(" Country Code Source: ").append(countryCodeSource_);
      }
      return outputString.toString();
    }
  }
}
